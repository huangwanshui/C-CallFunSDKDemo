/*********************************************************************************
*Author:	Yongjun Zhao(赵永军)
*Description:  
*History:  
Date:	2014.01.01/Yongjun Zhao
Action：Create
**********************************************************************************/
#pragma once
#include "XTypes.h"

#ifndef SystemTime
/// 系统时间结构,需要和SYSTEM_TIME保持一致
struct SystemTime
{
    int  year;		///< 年。
    int  month;		///< 月，January = 1, February = 2, and so on.
    int  day;		///< 日。
    int  wday;		///< 星期，Sunday = 0, Monday = 1, and so on
    int  hour;		///< 时。
    int  minute;	///< 分。
    int  second;	///< 秒。
    int  isdst;		///< 夏令时标识。
};
#endif

typedef struct Xpms_Search_AlarmInfo_Req
{
    char Uuid[100];
    SystemTime StarTime;	//报警信息查询起始时间
    SystemTime EndTime;     //报警信息查询结束时间，全0表示当前时间
    int Channel;			//Channel < 0 表示全部查询，通道号是从0开始的
    int AlarmType;          //报警类型(暂时无用)
    int Number;             //请求要查的报警条数 ，Number <= 0 表示查全部
    int Index;				//需要从查询的结果中哪一条开始取
    char Res[32];
}XPMS_SEARCH_ALARMINFO_REQ;


typedef struct Xpms_Search_AlarmPic_Req
{
    char Uuid[64];
    uint64 ID;		//报警信息ID号
    char Res[32];
}XPMS_SEARCH_ALARMPIC_REQ;

typedef enum EMSGLANGUAGE
{
    ELG_ENGLISH = 1,
    ELG_CHINESE = 2,
}EMSGLANGUAGE;

typedef enum EAPPTYPE
{
    EXMFamily = 1,
    EFamilyCenter = 2,
    EXMEye = 3,
    EFamily_BaiAn = 4,
}EAPPTYPE;

typedef struct SMCInitInfo
{
    char user[64];
    char password[64];
    char token[128];
    int language;       // EMSGLANGUAGE
    int appType;        // EAPPTYPE
    char szAppType[64];	// XXXXXX
}SMCInitInfo;

int MC_Init(UI_HANDLE hUser, SMCInitInfo *pInfo, int nSeq);
int MC_DevConnect(UI_HANDLE hUser, const char *uuid, int nSeq = 0);
int MC_DevDisConnect(UI_HANDLE hUser, const char *uuid, int nSeq = 0);
int MC_LinkDev(UI_HANDLE hUser, const char *uuid, const char *devUsername, const char *devPwd, int nSeq = 0, const char *strDevName = NULL, const char *strVoice = NULL);
int MC_UnlinkDev(UI_HANDLE hUser, const char *uuid, int nSeq = 0);
int MC_SendControlData(UI_HANDLE hUser, const char *uuid, const char *buf, int nSeq = 0);

// 返回0:Unlinked  1:Linked(会很快返回,存在本地了)
int MC_GetLinkState(const char *uuid);

//下面2个查询函数，是短连接，查询完了就关闭TCP连接。
//成功返回查询符合搜索条件的报警条数，失败返回-1
int MC_SearchAlarmInfo(UI_HANDLE hUser, XPMS_SEARCH_ALARMINFO_REQ *pXPMS_SEARCH_ALARMINFO_REQ, int nSeq = 0);

//成功返回0，失败返回-1
//pXPMS_SEARCH_ALARMPIC_REQ==NULL时,只是查询缓存数据有没有,不从服务器获取
int MC_SearchAlarmPic(UI_HANDLE hUser, const char *fileName, XPMS_SEARCH_ALARMPIC_REQ *pXPMS_SEARCH_ALARMPIC_REQ, int nSeq = 0);

// 获取域名转IP后的报警图片URL
char *MC_GetAlarmPicURL(char *strDNSPicURL, char strPicURL[512]);
