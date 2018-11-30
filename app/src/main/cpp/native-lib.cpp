#include <jni.h>
#include <string>
#include <android/log.h>
#include "FunSDK.h"
#include "netsdk.h"

#define TAG "TEST"
#define LOGD(...)  __android_log_print(ANDROID_LOG_DEBUG,TAG,__VA_ARGS__)
#define OS_ANDROID 1
//3614e52e8cdf727b
//51ff5bab400041fc
enum LOGIN_TYPE
{
     LOGIN_TYPE_WEB = 0,		///< WEB登陆(默认)
     LOGIN_TYPE_LOCALUPGRADE = 1,	///< 升级工具(局域网升级)登陆
     LOGIN_TYPE_CLOUDUPGRADE = 2,	///< 云升级登陆
     LOGIN_TYPE_PCCLIENT = 3,	///< PC客户端登陆
     LOGIN_TYPE_MOBILE = 4,		///< 移动终端（IPhone）登陆
     LOGIN_TYPE_FUTRUE_HOME = 5,	//未来家庭客户端登陆
     LOGIN_TYPE_XM030 = 6//xmeye客户端登陆
};
int callbackId = 2;
int playHandle;
char* devId;
int callback(int hSender, UI_HANDLE hWnd, int nId, int nParam1, int nParam2, int nParam3, const char *szParam, const void *pData, int nDataLen, int nSeq) {
    LOGD("nID:%d nParam1:%d nParam2:%d nParam3:%d",nId,nParam1,nParam2,nParam3);
    if (nId == 5139 && nParam1 >= 0) {
//        FUN_DevGetConfigJson(callbackId,"3614e52e8cdf727b","SystemInfo",-1,0,0);
    }else if (nId == 5128 && nParam1 >= 0 && pData != NULL) {
        LOGD("json:%s",pData);
    }else if (nId == 5533 && nParam1 >= 0) {
        LOGD("json:%s",szParam);
    }
    return 0;
}

extern "C" {
    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_funInit(
            JNIEnv *env,
            jobject /* this */) {
        SInitParam *param = new SInitParam();
        param->nAppType = LOGIN_TYPE_MOBILE;
        FUN_Init(0,param);
        delete(param);
        FUN_SysInit("",0);
        FUN_XMCloundPlatformInit("e0534f3240274897821a126be19b6d46",
                                 "0621ef206a1d4cafbe0c5545c3882ea8",
                                 "90f8bc17be2a425db6068c749dee4f5d",2);
        Fun_LogInit(0,"",0,"");
        FUN_InitNetSDK();
        devId = new char[32];
        memset(devId,0,32);
        strcpy(devId,"51ff5bab400041fc");

        Fun_InitMsgCallBack(&callback);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_funUnInit(
            JNIEnv *env,
            jobject /* this */) {
        FUN_UnInitNetSDK();
        FUN_UnInit(LOGIN_TYPE_MOBILE);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_devLogin(
            JNIEnv *env,
            jobject /* this */) {
        FUN_DevLogin(callbackId,devId,"admin","",0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_devLogout(
            JNIEnv *env,
            jobject /* this */) {
        FUN_DevLogout(callbackId,devId);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_playMonitor(
            JNIEnv *env,
            jobject /* this */) {
        playHandle = FUN_MediaRealPlay(callbackId,devId,0,0,(void*)1,NULL,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_stopMonitor(
            JNIEnv *env,
            jobject /* this */) {
        FUN_MediaStop(playHandle,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_searchRecordFiles(
            JNIEnv *env,
            jobject /* this */) {
        H264_DVR_FINDINFO findinfo;
        findinfo.startTime.dwYear = 2018;
        findinfo.startTime.dwMonth = 11;
        findinfo.startTime.dwDay = 28;
        findinfo.startTime.dwHour = 0;
        findinfo.startTime.dwMinute = 0;
        findinfo.startTime.dwSecond = 0;
        findinfo.endTime.dwYear = 2018;
        findinfo.endTime.dwMonth = 11;
        findinfo.endTime.dwDay = 28;
        findinfo.endTime.dwHour = 23;
        findinfo.endTime.dwMinute = 59;
        findinfo.endTime.dwSecond = 59;
        findinfo.nChannelN0 = 0;
        findinfo.StreamType = 0;
        FUN_DevFindFile(callbackId,devId,&findinfo,64);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_playBack(
            JNIEnv *env,
            jobject /* this */) {
        H264_DVR_FINDINFO findinfo;
        findinfo.startTime.dwYear = 2018;
        findinfo.startTime.dwMonth = 11;
        findinfo.startTime.dwDay = 28;
        findinfo.startTime.dwHour = 0;
        findinfo.startTime.dwMinute = 0;
        findinfo.startTime.dwSecond = 0;
        findinfo.endTime.dwYear = 2018;
        findinfo.endTime.dwMonth = 11;
        findinfo.endTime.dwDay = 28;
        findinfo.endTime.dwHour = 23;
        findinfo.endTime.dwMinute = 59;
        findinfo.endTime.dwSecond = 59;
        findinfo.nChannelN0 = 0;
        findinfo.StreamType = 0;
        playHandle = FUN_MediaNetRecordPlayByTime(callbackId,devId,&findinfo,NULL,NULL,0);
        if (playHandle != 0) {
            FUN_SetIntAttr(playHandle,EOA_SET_MEDIA_DATA_USER_AND_NO_DEC,1);
        }
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_stopPlayBack(
            JNIEnv *env,
            jobject /* this */) {
        FUN_MediaStop(playHandle,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_getSystemInfo(
            JNIEnv *env,
            jobject /* this */) {
        FUN_DevGetConfigJson(callbackId,devId,"SystemInfo",-1,0,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_getDevChannelName(
            JNIEnv *env,
            jobject /* this */) {
        FUN_DevGetConfigJson(callbackId,devId,"ChannelTitle",-1,0,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_getCameraInfo(
            JNIEnv *env,
            jobject /* this */) {
        FUN_DevGetConfigJson(callbackId,devId,"Camera.Param",0,0,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_setPTZ(
            JNIEnv *env,
            jobject /* this */) {
        FUN_DevPTZControl(callbackId,devId,0,2, false,4,0);
    }
}

