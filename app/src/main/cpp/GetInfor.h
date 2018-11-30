
#pragma once

#ifdef WIN32

#define GET_INFOR_API  extern "C" __declspec(dllexport)

#ifndef CALL_METHOD
#define CALL_METHOD	__stdcall  //__cdecl
#endif

#else	//linux
#define GET_INFOR_API	extern "C"
#define CALL_METHOD
#endif
// Error Code
#define  INFOR_OK   1
#define  INFOR_USER_EXIST -20		//用户已经存在
#define  INFOR_USER_NOEXIST  -21  //用户不存在
#define  INFOR_SQL_ERROR    -25  //sql失败
#define  INFOR_PASSWORD_NOT_VALID -22  //密码不正确
#define  INFOR_USER_NO_DEV   -23 //用户没有该设备

#define  INFOR_ILLEGAL_PARAM  -100

//
#define  DEV_MAX_COUNT    100 //最大数量为100

//增加IP,PORT
struct UserInfo
{
	char			_devId[64];			//设备序列号
	char			_Alias[128];		//别名
	char			_loginName[16];		//设备登陆用户
	char			_loginPsw[16];		//设备登陆密码
    char            Devip[96];
    char            devPort[32];
    char			type[16];			//设备类型
};

//Name:128->64 IP:32->96
struct DB_DevInfo_t
{
	char	Devmac[64];			//设备序列号
	char	Devname[64];		//别名
	char    Devip[96];
	char    devPort[32];
	char	loginName[16];		//设备登陆用户
	char	loginPsw[16];		//设备登陆密码
    char	type[16];			//设备类型

};

struct APPUpdate				//APP更新结构
{
	int  SignUpdate;
	int nUpdateType;			//更新类型，1为强制更新
	char APPVision[32];			//版本号
	char APPDownloadPath[128];	//版本下载地址
	char APPUpdateTip[1024];	//版本更新内容
};

struct PicUpdate				//图片更新结构
{
	int  SignUpdate;
	char PicName[64];			//图片名
	char PicTime[32];			//图片时间
	char PicDownloadPath[1024];	//图片下载地址
};

////初始化
//GET_INFOR_API long CALL_METHOD  Init(const char *IpServer,int nPort,int waittime);
//
//
////通过用户名获取设备列表
//GET_INFOR_API long  CALL_METHOD GetDevice_By_UserName(char*info,const char *UserName,const char *Psw, int nTimeout = 10000);
//
////注册用户
//GET_INFOR_API long  CALL_METHOD User_Register(const char *UserName,const char *Psw,const char *email, int nTimeout = 10000);
//
////检查用户名是否可用
//GET_INFOR_API long  CALL_METHOD User_CheckValid(const char *UserName, int nTimeout = 10000);
//
////修改用户密码
//GET_INFOR_API long  CALL_METHOD Psw_Change(const char *UserName,const char *old_Psw,const char *new_Psw, int nTimeout = 10000);
//
////增加用户设备
//GET_INFOR_API long  CALL_METHOD add_Device(DB_DevInfo_t info_Dev,const char *UserName,const char *Psw, int nTimeout = 10000);
//
////修改用户设备信息
//GET_INFOR_API long  CALL_METHOD ChangeDevInfo(struct UserInfo*ChangeDevInfor,const char *UserName,const char *Psw, int nTimeout = 10000);
//
////删除设备
//GET_INFOR_API long  CALL_METHOD Delete_Dev(const char *Delete_DevMac,const char *UserName,const char *Psw, int nTimeout = 10000);
//
////更新图片
//GET_INFOR_API long  CALL_METHOD TestUpdate(struct APPUpdate *appUpdater,struct PicUpdate *PicUpdaters,int PicUpdateCount, int nTimeout = 10000);
//
////修改用户密码
//GET_INFOR_API long  CALL_METHOD Psw_Restore(const char *UserName,const char *new_Psw, int nTimeout = 10000);
//
//GET_INFOR_API int  CALL_METHOD GI_GetLastError(char *szError, int nMaxSize);
