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

int callbackId = 2;
int playHandle;
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
    JNIEXPORT jstring JNICALL Java_com_example_hws_netsdkdemo_MainActivity_funInit(
            JNIEnv *env,
            jobject /* this */) {
        std::string hello = "Hello from C++";
        SInitParam *param = new SInitParam();
        param->nAppType = 5;
        memcpy(param->nSource,"xmshop", sizeof("xmshop"));
        memcpy(param->sLanguage,"zh", sizeof("zh"));
        FUN_Init(0,param);
        delete(param);
        FUN_SysInit("223.4.33.127;54.84.132.236;112.124.0.188",15010);
        Fun_LogInit(0,"123.59.14.61",9911,"");
        return env->NewStringUTF(hello.c_str());
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_devLogin(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_DevLogin(callbackId,"51ff5bab400041fc","admin","",0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_devLogout(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_DevLogout(callbackId,"51ff5bab400041fc");
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_playMonitor(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        playHandle = FUN_MediaRealPlay(callbackId,"51ff5bab400041fc",0,0,(void*)1,NULL,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_stopMonitor(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_MediaStop(playHandle,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_searchRecordFiles(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
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
        FUN_DevFindFile(callbackId,"51ff5bab400041fc",&findinfo,64);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_playBack(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
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
        playHandle = FUN_MediaNetRecordPlayByTime(callbackId,"51ff5bab400041fc",&findinfo,NULL,NULL,0);
        if (playHandle != 0) {
            FUN_SetIntAttr(playHandle,EOA_SET_MEDIA_DATA_USER_AND_NO_DEC,1);
        }
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_stopPlayBack(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_MediaStop(playHandle,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_getSystemInfo(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_DevGetConfigJson(callbackId,"51ff5bab400041fc","SystemInfo",-1,0,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_getDevChannelName(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_DevGetConfigJson(callbackId,"51ff5bab400041fc","ChannelTitle",-1,0,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_getCameraInfo(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_DevGetConfigJson(callbackId,"51ff5bab400041fc","Camera.Param",0,0,0);
    }

    JNIEXPORT void JNICALL Java_com_example_hws_netsdkdemo_MainActivity_setPTZ(
            JNIEnv *env,
            jobject /* this */) {
        Fun_InitMsgCallBack(&callback);
        FUN_DevPTZControl(callbackId,"51ff5bab400041fc",0,2, false,4,0);
    }
}

