package com.lib;

public class EUIMSG {
	public final static int SYS_GET_DEV_INFO_BY_USER = 5000; // 获取设备信息
	public final static int SYS_USER_REGISTER = 5001; // 注册用户
	public final static int SYS_USER_CHECKVALID = 5002; // 检查用户名是否可用
	public final static int SYS_PSW_CHANGE = 5003; // 修改用户密码
	public final static int SYS_ADD_DEVICE = 5004; // 增加用户设备
	public final static int SYS_CHANGEDEVINFO = 5005; // 修改用户设备信息
	public final static int SYS_DELETE_DEV = 5006; // 删除设备
	public final static int SYS_TESTUPDATE = 5007; // 更新图片
	public final static int SYS_PSW_RESTORE = 5008; // 用户密码恢复
	public final static int SYS_GET_DEV_STATE = 5009; 	// 获取设备状态
	public final static int SYS_GET_PHONE_CHECK_CODE = 5010; // 获取手机验证码
	public final static int SYS_REGISER_USER_XM = 5011; // 用户注册
	public final static int SYS_GET_DEV_INFO_BY_USER_XM = 5012; // 同步登录
	public final static int SYS_EDIT_PWD_XM = 5013; // 忘记用户登录密码
	public final static int SYS_FORGET_PWD_XM = 5014; // 忘记用户登录密码
	public final static int SYS_REST_PWD_CHECK_XM = 5015; // 重置用户登录密码
	public final static int SYS_RESET_PWD_XM = 5016; // 重置用户登录密码

	public final static int SYS_DEV_GET_PUBLIC = 5017; // 获取用户公开设备列表
	public final static int SYS_DEV_GET_SHARE = 5018; // 获取用户共享设备列表
	public final static int SYS_DEV_PUBLIC = 5019; // 公开设备
	public final static int SYS_DEV_SHARE = 5020; // 分享设备(分享视频)
	public final static int SYS_DEV_CANCLE_PUBLIC = 5021; // 取消公开设备
	public final static int SYS_DEV_CANCLE_SHARE = 5022; // 取消分享设备
	public final static int SYS_DEV_REGISTER = 5023;
	public final static int SYS_DEV_COMMENT = 5024;
	public final static int SYS_DEV_GET_COMMENT_LIST = 5025;
	public final static int SYS_DEV_GET_VIDEO_INFO = 5026; // 视频广场获取录像信息
	public final static int SYS_DEV_UPLOAD_VIDEO = 5027; // 视频广场上传
	public final static int SYS_DEV_GET_PHOTOS_LIST = 5028;
	public final static int SYS_DEV_CREATE_PHOTOS = 5029;
	public final static int SYS_DEV_UPLOAD_PHOTO = 5030;
	public final static int SYS_DEV_EDIT_PHOTO = 5031;
	public final static int SYS_DEV_GET_VIDEO_LIST = 5032;// 视频广场 短片列表
	public final static int SYS_DEV_EDIT_VIDEO = 5033;// 视频广场上传 编辑短片
	public final static int SYS_DEV_GET_PHOTO_LIST = 5034;// 视频广场图片列表
	public final static int SYS_DEV_DELETE_VIDEO = 5035;// 视频广场 删除短片
	public final static int SYS_DEV_DELETE_PHOTO = 5036; // 删除图片
	public final static int SYS_DEV_DELETE_PHOTOS = 5037; // 删除相册
	public final static int SYS_CHECK_PWD_STRENGTH = 5039;// 检测密码合法性和强度
	public final static int SYS_SEND_EMAIL_CODE = 5041; //发送邮箱验证码
	public final static int SYS_REGISTE_BY_EMAIL = 5042; //邮箱注册
	public final static int SYS_SEND_EMAIL_FOR_CODE = 5043; //发送邮箱验证码（修改密码、重置密码）
	public final static int SYS_CHECK_CODE_FOR_EMAIL = 5044;//验证邮箱验证码（修改密码、重置密码）
	public final static int SYS_PSW_CHANGE_BY_EMAIL = 5045; //通过邮箱修改密码（重置密码）

	public final static int SYS_CHECK_USER_REGISTE = 5046;// 检查用户是否已被注册
	public final static int SYS_LOGOUT_TO_XM = 5047; // 同步退出
	public final static int SYS_NO_VALIDATED_REGISTER = 5048; // 无需验证注册
	public final static int SYS_GET_USER_INFO = 5049; // 获取用户信息
	public final static int SYS_SEND_BINDING_PHONE_CODE = 5050; // 绑定安全手机(1)—发送验证码
	public final static int SYS_BINDING_PHONE = 5051; // 绑定安全手机(2)—验证code并绑定
	public final static int SYS_CLOUDUPGRADE_CHECK = 5052; // 设备是否需要升级查询
	public final static int SYS_CLOUDUPGRADE_DOWNLOAD = 5053; // 设备云升级下载
	public final static int SYS_SEND_BINDING_EMAIL_CODE = 5054; // 绑定安全手机(1)—发送验证码
	public final static int SYS_BINDING_EMAIL = 5055; // 绑定安全手机(2)—验证code并绑定
	// EMSG_SYS_BINDING_EMAIL, // 绑定安全邮箱(2)—验证code并绑定
	// EMSG_SYS_REGISER_USER_XM_EXTEND, // 用户注册(Extend)
	// EMSG_SYS_REGISTE_BY_EMAIL_EXTEND, // 邮箱注册(Extend)
	// EMSG_SYS_NO_VALIDATED_REGISTER_EXTEND, // 无需验证注册(Extend)
	public final static int STOP_CLOUDUPGRADE_DOWNLOAD = 5059; // 停止下载
	
	public final static int SYS_ADD_DEV_BY_FILE = 5060;			//5060
	public final static int SYS_GET_DEV_INFO_BY_USER_INSIDE = 5061;  //内部获取设备列表，用于android报警推送
	public final static int SYS_GET_DEVLOG = 5062;    				// 获取设备端日志，并上传到服务器
	public final static int SYS_GET_DEVLOG_END = 5063;				// 获取设备端日志，并上传到服务器
	public final static int SYS_WX_ALARM_LISTEN_OPEN = 5064;     	// 开启微信报警监听
	public final static int SYS_WX_ALARM_LISTEN_CLOSE = 5065;    	// 关闭微信报警监听
	public final static int SYS_WX_ALARM_WXPMSCHECK = 5066;    	    // 关闭微信报警监听状态查询
	public final static int SYS_CHECK_CS_STATUS     = 5067;    	    // 实时从服务器上查询云存储状态
	public final static int SYS_DULIST     = 5068;					// 获取设备所在的帐户信息
	public final static int SYS_MDSETMA    = 5069;					// 指定设备的主帐户
	public final static int SYS_MODIFY_USERNAME = 5070;             // 修改登录用户名（只能修改微信等绑定帐户自动生成）
	public final static int SYS_ON_DEV_STATE = 5071;				// 设备状态变化通知
	public final static int SYS_IS_MASTERMA = 5072;					// 获取当前账号是否为该设备的主账号
	public final static int SYS_GET_ABILITY_SET = 5073;				// 从服务器端获取设备的能力集
	public final static int SYS_CHECK_DEV_VALIDITY = 5074;			// 从服务端验证设备的合法性
	public final static int SYS_CANCELLATION_USER_XM = 5075;		// 注销用户账号
	public final static int APP_ON_SEND_LOG_FILE = 5098; // 日志信息回调
	public final static int APP_ON_MSG_LOG = 1; // 日志信息回调

	public final static int DEV_GET_CHN_NAME = 5100;
	public final static int DEV_FIND_FILE = 5101;
	public final static int DEV_FIND_FILE_BY_TIME = 5102;
	public final static int DEV_ON_DISCONNECT = 5103;
	public final static int DEV_ON_RECONNECT = 5104;
	public final static int DEV_PTZ_CONTROL = 5105;
	public final static int DEV_AP_CONFIG = 5106;
	public final static int DEV_GET_CONFIG = 5107;
	public final static int DEV_SET_CONFIG = 5108;
	public final static int DEV_GET_ATTR = 5109;
	public final static int DEV_SET_ATTR = 5110;
	public final static int DEV_START_TALK = 5111;
	public final static int DEV_SEND_MEDIA_DATA = 5112;
	public final static int DEV_STOP_TALK = 5113;
	public final static int ON_DEV_DISCONNECT = 5114;
	public final static int ON_REC_IMAGE_SYN = 5115; // 录像索引图片同步 param1 ==
														// 0：同步进度 总图片\已经同步图片
	// param1 == 1：param2 == 0 同步的数目
	public final static int ON_FILE_DOWNLOAD = 5116;
	public final static int ON_FILE_DLD_COMPLETE = 5117;
	public final static int ON_FILE_DLD_POS = 5118;
	public final static int DEV_START_UPGRADE = 5119; // param0表示表示结果
	public final static int DEV_ON_UPGRADE_PROGRESS = 5120; // param0==EUPGRADE_STEP
	// param1==2表示下载或升级进度或升级结果;
	// 进度0~100; 结果0成功 <0失败 200:已经是最新的程序
	public final static int DEV_STOP_UPGRADE = 5121;
	public final static int DEV_OPTION = 5122;
	public final static int DEV_START_SYN_IMAGE = 5123;
	public final static int DEV_STOP_SYN_IMAGE = 5124;
	public final static int DEV_CHECK_UPGRADE = 5125; // 检查设备升级状态,parma1<0:失败;==0:当前已经是最新程序;1:服务器上有最新的升级程序;2:支持云升级;
	public final static int DEV_SEARCH_DEVICES = 5126; // 查询设备
														// param1<0:失败;>=0返回查询到设备的个数(SDK_CONFIG_NET_COMMON_V2数组)
	public final static int DEV_SET_WIFI_CFG = 5127; // 直连模式下WIFI配置
	public final static int DEV_GET_JSON = 5128;
	public final static int DEV_SET_JSON = 5129;
	public final static int DEV_ON_TRANSPORT_COM_DATA = 5130;
	public final static int DEV_CMD_EN = 5131;
	public final static int DEV_GET_LAN_ALARM = 5132; // 局域网警报
	public final static int DEV_SEARCH_PIC = 5133;
	public final static int DEV_SEARCH_PIC_STOP = 5134;
	public final static int EMSG_DEV_START_UPLOAD_DATA = 5135;
	public final static int EMSG_DEV_STOP_UPLOAD_DATA = 5136;
	public final static int EMSG_DEV_ON_UPLOAD_DATA = 5137;
	public final static int ON_CLOSE_BY_LIB = 5138;
	public final static int DEV_LOGIN = 5139;
	public final static int DEV_BACKUP = 5140;
	public final static int DEV_SLEEP = 5141;
	public final static int DEV_WAKEUP = 5142;
	public final static int DEV_SET_NET_IP_BY_UDP = 5143;
	public final static int DEV_PREDATOR_FILES_OPERATION = 5144; //捕食器文件传输操作
	public final static int DEV_PREDATOR_SEND_FILE = 5145;
	public final static int DEV_PREDATOR_FILE_SAVE = 5146; //捕食器文件保存到本地
	public final static int DEV_START_PUSH_PICTURE = 5147; //开始推图
	public final static int DEV_STOP_PUSH_PICTURE = 5148;

	public final static int SET_PLAY_SPEED = 5500;
	public final static int START_PLAY = 5501;
	public final static int STOP_PLAY = 5502;
	public final static int PAUSE_PLAY = 5503;
	public final static int MEDIA_PLAY_DESTORY = 5504; // 媒体播放退出,通知播放对象
	public final static int START_SAVE_MEDIA_FILE = 5505; // 保存录像,保存格式用后缀区分 =
															// .dav私有;.avi:AVI格式;.mp4:MP4格式
	public final static int STOP_SAVE_MEDIA_FILE = 5506; // 停止录像
	public final static int SAVE_IMAGE_FILE = 5507; // 抓图 =
													// 5000;保存格式用后缀区分,.bmp或.jpg
	public final static int ON_PLAY_INFO = 5508; // 回调播放信息
	public final static int ON_PLAY_END = 5509; // 录像播放结束
	public final static int SEEK_TO_POS = 5510;
	public final static int SEEK_TO_TIME = 5511;
	public final static int SET_SOUND = 5512; // 打开，关闭声音
	public final static int ON_MEDIA_NET_DISCONNECT = 5513; // 媒体通道网络异常断开
	public final static int ON_MEDIA_REPLAY = 5514; // 媒体重新播放
	public final static int START_PLAY_BYTIME = 5515;
	public final static int ON_PLAY_BUFFER_BEGIN = 5516; // 正在缓存数据
	public final static int ON_PLAY_BUFFER_END = 5517; // 缓存结束,开始播放
	public final static int ON_PLAY_ERROR = 5518; // 回调播放异常,长时间没有
	public final static int ON_SET_PLAY_SPEED = 5519; // 播放速度
	public final static int REFRESH_PLAY = 5520;
	public final static int MEDIA_BUFFER_CHECK = 5521; // 缓存检查
	public final static int MEDIA_SET_PLAY_SIZE = 5522; // 设置高清/标清
	public final static int MEDIA_FRAME_LOSS = 5523; // 视频帧不足提示（可能是网络原因）
	public final static int ON_YUV_DATA = 5524; // YUV数据回调
	public final static int EMSG_MEDIA_SETPLAYVIEW = 5525; // 改变显示View
	public final static int ON_FRAME_USR_DATA = 5526;	// 用户自定义信息帧回调
	public final static int ON_Media_Thumbnail = 5527;    // 抓取视频缩略图
	public final static int ON_MediaData_Save = 5528;	    // 媒体数据开始保存
	public final static int MediaData_Save_Process = 5529;  // 媒体数据已保存大小(kB)
	public final static int EMSG_Stop_DownLoad = 5530;		// 停止录像下载
	public final static int Stop_DownLoad = 5530;			// 停止录像下载Andoir都是没有EMSG_的。统一下
	public final static int SET_INTELL_PLAY = 5532;   		// 智能播放
	public final static int ON_MEDIA_DATA = 5533;   		// 解码前的媒体数据回调
	public final static int DOWN_RECODE_BPIC_START =  5534;    //录像缩略图下载开始
	public final static int DOWN_RECODE_BPIC_FILE  =  5535;    //录像缩略图下载--文件下载结果返回
	public final static int DOWN_RECODE_BPIC_COMPLETE =  5536; //录像缩略图下载-下载完成（结束）

	// 报警推送
	public final static int MC_LinkDev = 6000;
	public final static int MC_UnlinkDev = 6001;
	public final static int MC_SendControlData = 6002;
	public final static int MC_SearchAlarmInfo = 6003;
	public final static int MC_SearchAlarmPic = 6004;
	public final static int MC_ON_LinkDisCb = 6005; // 设备断线
	public final static int MC_ON_ControlCb = 6006;
	public final static int MC_ON_AlarmCb = 6007; // 报警推送
	public final static int MC_ON_PictureCb = 6008; // 报警图片
	public final static int MC_ON_INIT = 6011; // 初始化
	public final static int MC_DeleteAlarm = 6012; 
	public final static int MC_GetAlarmRecordUrl = 6013; // 获取报警录像URL
	public final static int MC_SearchAlarmByMoth = 6014; // 获取报警的日历
	public final static int MC_OnRecvAlarmJsonData = 6015;  // 第三方服务器报警数据处理回调
	public final static int MC_StopDownloadAlarmImages = 6016;  //取消队列中图片下载
	public final static int MC_SearchAlarmLastTimeByType = 6017;  //按类型查询最后一条报警时间

	public final static int MC_Alarm_Subscribe = 6012;//废弃？？？
	public final static int MC_Alarm_UnSubscribe = 6013;
	// 云存储目录操作
	public final static int CD_MediaList = 6207;
	public final static int CD_MediaTimeSect = 6200;
	public final static int CD_Media_Dates = 6201;
	public final static int MC_SearchMediaByMoth = 6202;
	public final static int MC_SearchMediaByTime = 6203;
	public final static int MC_DownloadMediaThumbnail = 6204;

	// 视频广场
	public final static int XD_LinkMedia = 7001;
	public final static int XD_UnlinkMedia = 7002;
	public final static int XD_PublicHistoryList = 7003;
	public final static int XD_PublicCurrentList = 7004;
	public final static int XD_PublicDevInfo = 7005;
	public final static int XD_FetchPicture = 7006;

	public final static int CSS_API_CMD = 6600;
	public final static int KSS_API_UP_LOAD_VIDEO = 6601;// 上传视频至金山云
	public final static int KSS_API_CMD_GET = 6603;
	public final static int KSS_API_UP_LOAD_PHOTO = 6604;// 上传图片至金山云
	public final static int SYS_EDIT_USER_PHOTOS = 8500; // 修改相册

	// APP检查更新
	public final static int FIR_IM_CHECK_LATEST = 6800;

	public final static int JPEG_TO_MP4_ON_PROGRESS = 8000;
	public final static int JPEG_TO_MP4_ADD_FILE = 8001;
	public final static int JPEG_TO_MP4_CLOSE = 8002;
	public final static int JPEG_TO_MP4_CANCEL = 8003;
	
	public final static int SYS_BINDING_ACCOUNT = 8504; //绑定帐户
	public final static int OBJ_STATE_UPDATE = 5; 			// 状态信息回调显示
	
	// 其它自定义消息
    // 广告更新等消息返回
	public final static int CM_ON_VALUE_CHANGE = 8600;
	public final static int CM_ON_GET_SYS_MSG = 8603;
	public final static int CM_ON_GET_SYS_MSG_LIST = 8604;

}
