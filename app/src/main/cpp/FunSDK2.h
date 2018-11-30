/*********************************************************************************
*Author:	Yongjun Zhao(赵永军)
*Description:  
*History:  
Date:	2014.01.01/Yongjun Zhao
Action：Create
**********************************************************************************/
#pragma once
#include "XTypes.h"

// 通知设备媒体准备（推流到服务器，保证打开时更快）
void FUN_MediaPlayReady(const char *szDevId, int nChnIndex, int nStreamType);

char *FUN_EncDevInfo(char *szDevInfo, const char *szDevId, const char *szUser, const char *szPwd, int nType);
int FUN_DecDevInfo(const char *szDevInfo, char *szDevId, char *szUser, char *szPwd, int &nType);
char *FUN_DecDevInfo(const char *szDevInfo, char *szResult);

namespace ENCFun
{
int ResToInt(const char *szRes);
const char *ResToStr(int nRes);
};
using namespace ENCFun;

// 主码流分辨率和帧率确定的情况下,检查现有的辅码流的分辨率
// 如果不符合,找个合法的配置给出
// nMaxPowerPerChannel: 总的编码编码能力级
// nSupportResMark: 主码流对应的子码流分辨率掩码
// nMainRes:主码流分辨率
// nMainRate:主码流帧率
// nSubRes:子码流现有分辨率(输入\输出)
// nSubRate:子码流现有的帧率(输入\输出)
int CheckSubResRate(int nMaxPowerPerChannel, int nSupportResMark, int nMainRes, int nMainRate, int &nSubRes, int &nSubRate);

// 获取主码流的最大帧率
// nMaxPowerPerChannel: 总的编码编码能力级
// nSupportResMark: 主码流对应的子码流分辨率掩码
// nMainRes:主码流分辨率
// nMainRate:主码流帧率
// bNTCS：制式是否NTCS
int GetMainMaxRate(int nMaxPowerPerChannel, int nSupportResMark, int nMainRes, int bNTCS);

//通过SSID名称来判断设备类型
int CheckDevType(const char *szDevSSID);

// 获取设置 0xffffffff ffffffff ffffffff: 31~0 63~32 95~64...
bool Dev_IsSelectHex(const char *szHex, unsigned int nIndex);
char *Dev_SetSelectHex(char szHex[48], unsigned int nIndex, bool bSelected);

int GN_WriteFile(const char *szFileName, const char *pData, int nDataLen);
int GN_DeleteFile(const char *szFileName);
