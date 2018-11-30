/*********************************************************************************
 *Author:	Yongjun Zhao(赵永军)
 *Description:
 *History:
Date:	2016.02.17/Yongjun Zhao
 Action：Create
 **********************************************************************************/
#pragma once
#include "XTypes.h"

// 获取视频广告路径,本地没有视频时没有返回""
// 注意调用过此接口后,库里才会自动下载视频广告
const char *CM_GetVideoPath();

const char *CM_GetPicPath(int nWidth, int nHeight);
const char *CM_GetValue(const char *szKey, const char *szDefault = "");
int CM_GetIntValue(const char *szKey, int nDelfault = 0);



