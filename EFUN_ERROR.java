package com.lib;

public class EFUN_ERROR {
	public final static int EE_OBJ_NOT_EXIST = -1239510;
	@ErrorLink(resId = "EE_DVR_SDK_UNKNOWNERROR")
	public final static int EE_ERROR = -100000;
	public final static int EE_PARAM_ERROR = -99999;
	public final static int EE_CREATE_FILE = -99998;
	public final static int EE_OPEN_FILE = -99997;
	public final static int EE_WRITE_FILE = -99996;

	@ErrorLink(resId = "Try_again_after_opening_flow")
	public final static int EE_PLAY_ERROR = -120;
	@ErrorLink(resId = "EE_READ_FILE")
	public final static int EE_READ_FILE = -99995;
	public final static int EE_NO_SUPPORTED = -99994;

	@ErrorLink(resId = "Network_Error")
	public final static int EE_NET = -99993; // 网络错误
	@ErrorLink(resId = "EE_START_TALK")
	public final static int EE_START_TALK = -400012;

	@ErrorLink(resId = "Network_Error")
	public final static int EE_RecNET = -99988; // 网络错误
	@ErrorLink(resId = "EE_ADD_DEVICE_EXSIT_ERROR")
	public final static int EE_OBJ_EXIST = -99992;

	@ErrorLink(resId = "EE_DVR_SDK_TIMEOUT")
	public final static int EE_TIMEOUT = -99991;

	@ErrorLink(resId = "EE_DVR_SDK_TIMEOUT")
	public final static int EE_NOT_FOUND = -99990;

	@ErrorLink(resId = "Network_Error")
	public final static int EE_NET_PACKET_LOSS = -99988;// 网络丢包

	@ErrorLink(resId = "EE_DVR_SDK_NOTVALID")
	public final static int EE_DVR_SDK_NOTVALID = -10000; // 非法请求

	@ErrorLink(resId = "EE_DVR_NO_INIT")
	public final static int EE_DVR_NO_INIT = -10001; // SDK未经初始化

	@ErrorLink(resId = "EE_DVR_ILLEGAL_PARAM")
	public final static int EE_DVR_ILLEGAL_PARAM = -10002; // 用户参数不合法

	@ErrorLink(resId = "EE_DVR_INVALID_HANDLE")
	public final static int EE_DVR_INVALID_HANDLE = -10003; // 句柄无效

	@ErrorLink(resId = "EE_DVR_SDK_UNINIT_ERROR")
	public final static int EE_DVR_SDK_UNINIT_ERROR = -10004; // SDK清理出错

	@ErrorLink(resId = "EE_DVR_SDK_TIMEOUT")
	public final static int EE_DVR_SDK_TIMEOUT = -10005; // 等待超时

	@ErrorLink(resId = "EE_DVR_SDK_MEMORY_ERROR")
	public final static int EE_DVR_SDK_MEMORY_ERROR = -10006; // 内存错误，创建内存失败

	@ErrorLink(resId = "EE_DVR_SDK_NET_ERROR")
	public final static int EE_DVR_SDK_NET_ERROR = -10007; // 网络错误

	@ErrorLink(resId = "EE_DVR_SDK_OPEN_FILE_ERROR")
	public final static int EE_DVR_SDK_OPEN_FILE_ERROR = -10008; // 打开文件失败

	@ErrorLink(resId = "EE_DVR_SDK_UNKNOWNERROR")
	public final static int EE_DVR_SDK_UNKNOWNERROR = -10009; // 未知错误

	@ErrorLink(resId = "EE_DVR_DEV_VER_NOMATCH")
	public final static int EE_DVR_DEV_VER_NOMATCH = -11000; // 收到数据不正确，可能版本不匹配

	@ErrorLink(resId = "EE_DVR_SDK_NOTSUPPORT")
	public final static int EE_DVR_SDK_NOTSUPPORT = -11001; // 版本不支持

	@ErrorLink(resId = "EE_DVR_OPEN_CHANNEL_ERROR")
	public final static int EE_DVR_OPEN_CHANNEL_ERROR = -11200; // 打开通道失败

	@ErrorLink(resId = "EE_DVR_CLOSE_CHANNEL_ERROR")
	public final static int EE_DVR_CLOSE_CHANNEL_ERROR = -11201; // 关闭通道失败

	@ErrorLink(resId = "EE_DVR_SUB_CONNECT_ERROR")
	public final static int EE_DVR_SUB_CONNECT_ERROR = -11202; // 建立媒体子连接失败

	@ErrorLink(resId = "EE_DVR_SUB_CONNECT_SEND_ERROR")
	public final static int EE_DVR_SUB_CONNECT_SEND_ERROR = -11203; // 媒体子连接通讯失败

	@ErrorLink(resId = "EE_DVR_NATCONNET_REACHED_MAX")
	public final static int EE_DVR_NATCONNET_REACHED_MAX = -11204; // Nat视频链接达到最大，不允许新的Nat视频链接

	// / 用户管理部分错误码
	@ErrorLink(resId = "EE_DVR_NOPOWER")
	public final static int EE_DVR_NOPOWER = -11300; // 无权限

	@ErrorLink(resId = "Invalid_Password")
	public final static int EE_DVR_PASSWORD_NOT_VALID = -11301; // 账号密码不对

	@ErrorLink(resId = "User_not_exist")
	public final static int EE_DVR_LOGIN_USER_NOEXIST = -11302; // 用户不存在

	@ErrorLink(resId = "EE_DVR_USER_LOCKED")
	public final static int EE_DVR_USER_LOCKED = -11303; // 该用户被锁定（输入不同的密码错误七次会被锁，断电重启即可解锁）

	@ErrorLink(resId = "EE_DVR_USER_IN_BLACKLIST")
	public final static int EE_DVR_USER_IN_BLACKLIST = -11304; // 该用户不允许访问(在黑名单中")

	@ErrorLink(resId = "EE_DVR_USER_HAS_USED")
	public final static int EE_DVR_USER_HAS_USED = -11305; // 该用户以登陆

	@ErrorLink(resId = "EE_DVR_USER_NOT_LOGIN")
	public final static int EE_DVR_USER_NOT_LOGIN = -11306; // 该用户没有登陆

	@ErrorLink(resId = "Device_NotExist")
	public final static int EE_DVR_CONNECT_DEVICE_ERROR = -11307; // 可能设备不存在

	@ErrorLink(resId = "EE_DVR_ACCOUNT_INPUT_NOT_VALID")
	public final static int EE_DVR_ACCOUNT_INPUT_NOT_VALID = -11308; // 用户管理输入不合法

	@ErrorLink(resId = "EE_DVR_ACCOUNT_OVERLAP")
	public final static int EE_DVR_ACCOUNT_OVERLAP = -11309; // 索引重复

	@ErrorLink(resId = "EE_DVR_ACCOUNT_OBJECT_NONE")
	public final static int EE_DVR_ACCOUNT_OBJECT_NONE = -11310; // 不存在对象; 用于查询时

	@ErrorLink(resId = "EE_DVR_ACCOUNT_OBJECT_NOT_VALID")
	public final static int EE_DVR_ACCOUNT_OBJECT_NOT_VALID = -11311; // 不存在对象

	@ErrorLink(resId = "EE_DVR_ACCOUNT_OBJECT_IN_USE")
	public final static int EE_DVR_ACCOUNT_OBJECT_IN_USE = -11312; // 对象正在使用

	@ErrorLink(resId = "EE_DVR_ACCOUNT_SUBSET_OVERLAP")
	public final static int EE_DVR_ACCOUNT_SUBSET_OVERLAP = -11313; // 子集超范围
																	// (如组的权限超过权限表，用户权限超出组的权限范围等等")

	@ErrorLink(resId = "EE_DVR_ACCOUNT_PWD_NOT_VALID")
	public final static int EE_DVR_ACCOUNT_PWD_NOT_VALID = -11314; // 密码不正确

	@ErrorLink(resId = "EE_DVR_ACCOUNT_PWD_NOT_MATCH")
	public final static int EE_DVR_ACCOUNT_PWD_NOT_MATCH = -11315; // 密码不匹配

	@ErrorLink(resId = "EE_DVR_ACCOUNT_RESERVED")
	public final static int EE_DVR_ACCOUNT_RESERVED = -11316; // 保留帐号

	public final static int EE_DVR_PASSWORD_NOT_VALID2 = -11318; // 账号密码不对
	
	// / 配置管理相关错误码
	@ErrorLink(resId = "EE_DVR_OPT_RESTART")
	public final static int EE_DVR_OPT_RESTART = -11400; // 保存配置后需要重启应用程序

	@ErrorLink(resId = "EE_DVR_OPT_REBOOT")
	public final static int EE_DVR_OPT_REBOOT = -11401; // 需要重启系统

	@ErrorLink(resId = "EE_DVR_OPT_FILE_ERROR")
	public final static int EE_DVR_OPT_FILE_ERROR = -11402; // 写文件出错

	@ErrorLink(resId = "EE_DVR_OPT_CAPS_ERROR")
	public final static int EE_DVR_OPT_CAPS_ERROR = -11403; // 配置特性不支持

	@ErrorLink(resId = "Config_Check_Error")
	public final static int EE_DVR_OPT_VALIDATE_ERROR = -11404; // 配置校验失败

	@ErrorLink(resId = "EE_DVR_OPT_CONFIG_NOT_EXIST")
	public final static int EE_DVR_OPT_CONFIG_NOT_EXIST = -11405; // 请求或者设置的配置不存在

	@ErrorLink(resId = "EE_DVR_OPT_CONFIG_PARSE_ERROR")
	public final static int EE_DVR_OPT_CONFIG_PARSE_ERROR = -11406; // 配置解析出错

	@ErrorLink(resId = "EE_DVR_CTRL_PAUSE_ERROR")
	public final static int EE_DVR_CTRL_PAUSE_ERROR = -11500; // 暂停失败

	@ErrorLink(resId = "EE_DVR_SDK_NOTFOUND")
	public final static int EE_DVR_SDK_NOTFOUND = -11501; // 查找失败，没有找到对应文件

	@ErrorLink(resId = "EE_DVR_CFG_NOT_ENABLE")
	public final static int EE_DVR_CFG_NOT_ENABLE = -11502; // 配置未启用

	@ErrorLink(resId = "EE_DVR_DECORD_FAIL")
	public final static int EE_DVR_DECORD_FAIL = -11503; // 解码失败

	@ErrorLink(resId = "EE_DVR_NOPOWER")
	public final static int EE_DVR_NO_ENCODE_CONFIG = -607; // 不支持此项配置(编码配置")

	// DNS协议解析返回错误码
	@ErrorLink(resId = "EE_DVR_SOCKET_ERROR")
	public final static int EE_DVR_SOCKET_ERROR = -11600; // 创建套节字失败

	@ErrorLink(resId = "EE_DVR_SOCKET_CONNECT")
	public final static int EE_DVR_SOCKET_CONNECT = -11601; // 连接套节字失败

	@ErrorLink(resId = "EE_DVR_SOCKET_DOMAIN")
	public final static int EE_DVR_SOCKET_DOMAIN = -11602; // 域名解析失败

	@ErrorLink(resId = "EE_DVR_SOCKET_SEND")
	public final static int EE_DVR_SOCKET_SEND = -11603; // 发送数据失败

	@ErrorLink(resId = "EE_DVR_ARSP_NO_DEVICE")
	public final static int EE_DVR_ARSP_NO_DEVICE = -11604; // 没有获取到设备信息，设备应该不在线

	@ErrorLink(resId = "EE_DVR_ARSP_BUSING")
	public final static int EE_DVR_ARSP_BUSING = -11605; // ARSP服务繁忙

	public final static int EE_DVR_ARSP_BUSING_SELECT = -11606; // ARSP服务繁忙;select失败

	public final static int EE_DVR_ARSP_BUSING_RECVICE = -11607; // ARSP服务繁忙;recvice失败

	@ErrorLink(resId = "Server_failed")
	public final static int EE_DVR_CONNECTSERVER_ERROR = -11608; // 连接服务器失败
	// public final static int EE_DVR_ARSP_USER_NOEXIST = -11609; // 用户不存在
	// public final static int EE_DVR_ARSP_PASSWORD_ERROR = -11610; // 账号密码不对
	// public final static int EE_DVR_ARSP_QUERY_ERROR = -11611; // 查询失败

	@ErrorLink(resId = "EE_DVR_CONNECT_AGNET")
	public final static int EE_DVR_CONNECT_AGNET = -11609; // 代理

	public final static int EE_DVR_CONNECT_NAT = -11610; // 穿透

	@ErrorLink(resId = "connect_f")
	public final static int EE_DVR_CONNECT_FAILED = -11611; // 连接失败

	public final static int EE_DVR_CONNECT_FULL = -11612; // 服务器连接数已满

	@ErrorLink(resId = "EE_AS_SELECT_AUTHCODE_CDOE1")
	public final static int EE_DVR_CONNECT_FAILE = -11613; // 服务器查询失败

	// 版权相关
	public final static int EE_DVR_PIRATESOFTWARE = -11700; // 设备盗版

	public final static int EE_ILLEGAL_PARAM = -200000; // 无效参数

	@ErrorLink(resId = "EE_USER_EXIST")
	public final static int EE_USER_EXIST = -200001; // 用户已经存在

	public final static int EE_SQL_ERROR = -200002; // sql失败

	@ErrorLink(resId = "Invalid_Password")
	public final static int EE_PASSWORD_NOT_VALID = -200003; // 密码不正确

	@ErrorLink(resId = "EE_ADD_DEVICE_EXSIT_ERROR")
	public final static int EE_USER_NO_DEV = -200004; // 该设备已经存在

	@ErrorLink(resId = "EE_DEV_NOT_LOGIN")
	public final static int EE_DEV_NOT_LOGIN = -200005; // 登录失败

	public final static int EE_FUN_BEEN_START = -200006;

	@ErrorLink(resId = "already_register_username")
	public final static int EE_USER_EXSIT = -200007; // 用户名已经被注册
	// 报警库相关错误值
	@ErrorLink(resId = "EE_DVR_SDK_UNKNOWNERROR")
	public final static int EE_MC_UNKNOWNERROR = -201101; // / 未知错误

	@ErrorLink(resId = "EE_DVR_SDK_NOTVALID")
	public final static int EE_MC_NOTVALID = -201102; // / 非法请求

	public final static int EE_MC_MSGFORMATERR = -201103; // / 消息格式错误

	@ErrorLink(resId = "EE_DVR_USER_HAS_USED")
	public final static int EE_MC_LOGINED = -201104; // / 该用户已经登录

	@ErrorLink(resId = "EE_DVR_USER_NOT_LOGIN")
	public final static int EE_MC_UNLOGINED = -201105; // / 该用户未登录

	@ErrorLink(resId = "Invalid_Password")
	public final static int EE_MC_USERORPWDERROR = -201106; // / 用户名密码错误

	@ErrorLink(resId = "EE_DVR_NOPOWER")
	public final static int EE_MC_NOPOWER = -201107; // / 无权限

	@ErrorLink(resId = "EE_DVR_SDK_NOTSUPPORT")
	public final static int EE_MC_NOTSUPPORT = -201108; // / 版本不支持

	@ErrorLink(resId = "EE_DVR_SDK_TIMEOUT")
	public final static int EE_MC_TIMEOUT = -201109; // / 超时

	@ErrorLink(resId = "EE_DVR_SDK_NOTFOUND")
	public final static int EE_MC_NOTFOUND = -201110; // / 查找失败，没有找到对应文件

	@ErrorLink(resId = "EE_MC_FOUND")
	public final static int EE_MC_FOUND = -201111; // / 查找成功，返回全部文件

	@ErrorLink(resId = "EE_MC_FOUND")
	public final static int EE_MC_FOUNDPART = -201112; // / 查找成功，返回部分文件
	public final static int EE_MC_PIRATESOFTWARE = -201113; // / 盗版软件

	@ErrorLink(resId = "EE_DVR_SDK_NOTFOUND")
	public final static int EE_MC_FILE_NOT_FOUND = -201114; // / 没有查询到文件

	@ErrorLink(resId = "EE_DVR_ARSP_NO_DEVICE")
	public final static int EE_MC_PEER_ONLINE = -201115; // / 对端在线

	@ErrorLink(resId = "EE_DVR_ARSP_NO_DEVICE")
	public final static int EE_MC_PEER_NOT_ONLINE = -201116; // / 对端不在线

	@ErrorLink(resId = "Connection_Number_Reached_MAX")
	public final static int EE_MC_PEERCONNET_REACHED_MAX = -201117; // 对端连接数已达上限

	@ErrorLink(resId = "LINK_SERVER_ERROR")
	public final static int LINK_SERVER_ERROR = -201118;// 连接服务器失败

	@ErrorLink(resId = "APP_TYPE_ERROR")
	public final static int APP_TYPE_ERROR = -201119;// APP类型错误

	@ErrorLink(resId = "SEND_DATA_ERROR")
	public final static int SEND_DATA_ERROR = -201120;// 发送数据出错

	@ErrorLink(resId = "AUTHCODE_ERROR")
	public final static int AUTHCODE_ERROR = -2011121;// 获取AUTHCODE有误

	@ErrorLink(resId = "XPMS_UNINIT")
	public final static int XPMS_UNINIT = -201122;// 未初始化

	@ErrorLink(resId = "Server_Response_Error")
	public final static int EE_AS_PHONE_CODE = -210000; // 服务器应答出错

	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_PHONE_CODE0 = -210002; // 接口验证失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_PHONE_CODE1 = -210003; // 参数错误

	@ErrorLink(resId = "already_register_mobile")
	public final static int EE_AS_PHONE_CODE2 = -210004; // 手机号码已被注册

	@ErrorLink(resId = "forget_code_send_more3")
	public final static int EE_AS_PHONE_CODE3 = -210005; // 超出短信每天发送次数限制(每个号码发送注册验证信息1天只能发送三次")

	@ErrorLink(resId = "sms_send_failure")
	public final static int EE_AS_PHONE_CODE4 = -210010; // 发送失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE5")
	public final static int EE_AS_PHONE_CODE5 = -210017;// 120秒之内只能发送一次

	@ErrorLink(resId = "Server_Response_Error")
	public final static int EE_AS_REGISTER_CODE = -210100; // 服务器应答出错

	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_REGISTER_CODE0 = -210102; // 接口验证失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_REGISTER_CODE1 = -210103; // 参数错误

	@ErrorLink(resId = "already_register_mobile")
	public final static int EE_AS_REGISTER_CODE2 = -210104; // 手机号码已被注册

	@ErrorLink(resId = "already_register_username")
	public final static int EE_AS_REGISTER_CODE3 = -210106; // 用户名已被注册

	@ErrorLink(resId = "EE_AS_REGISTER_CODE4")
	public final static int EE_AS_REGISTER_CODE4 = -210107; // 注册码验证错误

	@ErrorLink(resId = "register_failure")
	public final static int EE_AS_REGISTER_CODE5 = -210110; // 注册失败（msg里有失败具体信息）

	@ErrorLink(resId = "Server_Response_Error")
	public final static int EE_AS_LOGIN_CODE = -210200; // 服务器应答出错

	@ErrorLink(resId = "EE_AS_LOGIN_CODE0")
	public final static int EE_AS_LOGIN_CODE0 = -210201; // 发送成功

	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_LOGIN_CODE1 = -210202; // 接口验证失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_LOGIN_CODE2 = -210203; // 参数错误

	@ErrorLink(resId = "login_failed")
	public final static int EE_AS_LOGIN_CODE3 = -210210; // 登录失败

	@ErrorLink(resId = "Server_Response_Error")
	public final static int EE_AS_EIDIT_PWD_CODE0 = -210300;// 服务器应答失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_EIDIT_PWD_CODE1 = -210302; // 接口验证失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_EIDIT_PWD_CODE2 = -210303; // 参数错误

	@ErrorLink(resId = "edit_pwd_error3")
	public final static int EE_AS_EIDIT_PWD_CODE3 = -210311; // 新密码不符合要求

	@ErrorLink(resId = "edit_pwd_error4")
	public final static int EE_AS_EIDIT_PWD_CODE4 = -210313; // 原密码错误

	@ErrorLink(resId = "edit_pwd_error6")
	public final static int EE_AS_EIDIT_PWD_CODE5 = -210315; // 新旧密码相同

	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_FORGET_PWD_CODE1 = -210402; // 接口验证失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_FORGET_PWD_CODE2 = -210403; // 参数错误

	@ErrorLink(resId = "forget_code_send_more3")
	public final static int EE_AS_FORGET_PWD_CODE3 = -210405; // 超出短信每天发送次数限制(每个号码发送注册验证信息1天只能发送三次")

	@ErrorLink(resId = "sms_send_failure")
	public final static int EE_AS_FORGET_PWD_CODE4 = -210410; // 发送失败（msg里有失败具体信息）

	@ErrorLink(resId = "forget_mobile_non")
	public final static int EE_AS_FORGET_PWD_CODE5 = -210414; // 手机号码不存在

	@ErrorLink(resId = "EE_AS_PHONE_CODE6")
	public final static int EE_AS_FORGET_PWD_CODE6 = -210416; // 手机号码和用户名不匹配

	@ErrorLink(resId = "EE_AS_PHONE_CODE5")
	public final static int EE_AS_FORGET_PWD_CODE7 = -210417; // 120秒之内只能发送一次

	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_RESET_PWD_CODE1 = -210502; // 接口验证失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_RESET_PWD_CODE2 = -210503; // 参数错误

	@ErrorLink(resId = "edit_pwd_error3")
	public final static int EE_AS_RESET_PWD_CODE3 = -210511; // 新密码不符合要求

	@ErrorLink(resId = "EE_AS_RESET_PWD_CODE4")
	public final static int EE_AS_RESET_PWD_CODE4 = -210512; // 两次输入的新密码不一致

	@ErrorLink(resId = "forget_mobile_non")
	public final static int EE_AS_RESET_PWD_CODE5 = -210514; // 手机号码不存在

	@ErrorLink(resId = "edit_pwd_error3")
	public final static int EE_AS_RESET_PWD_CODE6 = -210513;// 密码8-32位 必须包含数字和字母

	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_CHECK_PWD_CODE1 = -210602; // 接口验证失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_CHECK_PWD_CODE2 = -210603; // 参数错误

	@ErrorLink(resId = "register_code_error")
	public final static int EE_AS_CHECK_PWD_CODE3 = -210607; // 验证码错误

	@ErrorLink(resId = "forget_mobile_non")
	public final static int EE_AS_CHECK_PWD_CODE4 = -210614; // 手机号码不存在

	// 视频广场相关
	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_GET_PUBLIC_DEV_LIST_CODE = -210700; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_GET_SHARE_DEV_LIST_CODE = -210800; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SET_DEV_PUBLIC_CODE = -210900; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SHARE_DEV_VIDEO_CODE = -211000; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_CANCEL_DEV_PUBLIC_CODE = -211100; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_CANCEL_SHARE_VIDEO_CODE = -211200; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_DEV_REGISTER_CODE = -211300; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SEND＿COMMNET_CODE = -211400; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_GET_COMMENT_LIST_CODE = -211500; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_GET_VIDEO_INFO_CODE = -211600; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_UPLOAD_LOCAL_VIDEO_CODE = -211700; // 服务器响应失败

	@ErrorLink(resId = "EE_AS_UPLOAD_LOCAL_VIDEO_CODE1")
	public final static int EE_AS_UPLOAD_LOCAL_VIDEO_CODE1 = -211703; // 缺少上传文件

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_GET_SHORT_VIDEO_LIST_CODE = -211800; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_EDIT_SHORT_VIDEO_INFO_CODE = -211900; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_DELETE_SHORT_VIDEO_CODE = -212000; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SELECT_AUTHCODE_CDOE = -212100; // 服务响应失败

	@ErrorLink(resId = "EE_AS_SELECT_AUTHCODE_CDOE1")
	public final static int EE_AS_SELECT_AUTHCODE_CDOE1 = -212104; // 服务器查询失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_GET_USER_PHOTOS_LIST_CODE = -212200; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_CREATE_USER_PHOTOS_CODE = -212300; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_UPLOAD_PHOTO_CODE = -212400; // 服务响应失败

	@ErrorLink(resId = "EE_AS_UPLOAD_PHOTO_CODE1")
	public final static int EE_AS_UPLOAD_PHOTO_CODE1 = -212402; // 没有接受到上传的文件

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_EDIT_PHOTO_INFO_CODE = -212500; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_GET_PHOTO_LIST_CODE = -212600; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_CHECK_PWD_STRENGTH_CODE = -212900; // 服务响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_CHECK_PWD_STRENGTH_CODE1 = -212901; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_CHECK_PWD_STRENGTH_CODE2 = -212903; // 参数错误
	@ErrorLink(resId = "edit_pwd_error3")
	public final static int EE_AS_CHECK_PWD_STRENGTH_CODE3 = -212910; // 密码不合格

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_DELETE_PHOTO_CODE = -212700; // 服务响应失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_DELETE_PHOTOS_CODE = -212800; // 服务响应失败

	@ErrorLink(resId = "EE_CLOUD_DEV_MAC_BACKLIST")
	public final static int EE_CLOUD_DEV_MAC_BACKLIST = -213600; // 在黑名单中(mac")

	@ErrorLink(resId = "EE_CLOUD_DEV_MAC_EXSIT")
	public final static int EE_CLOUD_DEV_MAC_EXSIT = -213601; // 已存在

	@ErrorLink(resId = "EE_CLOUD_DEV_MAC_EMPTY")
	public final static int EE_CLOUD_DEV_MAC_EMPTY = -213602; // mac值为空

	@ErrorLink(resId = "EE_CLOUD_DEV_MAC_INVALID")
	public final static int EE_CLOUD_DEV_MAC_INVALID = -213603; // 格式不对(mac地址长度不为16位或者有关键字")

	@ErrorLink(resId = "EE_CLOUD_DEV_MAC_UNREDLIST")
	public final static int EE_CLOUD_DEV_MAC_UNREDLIST = -213604; // 不存在白名单

	@ErrorLink(resId = "EE_CLOUD_DEV_NAME_EMPTY")
	public final static int EE_CLOUD_DEV_NAME_EMPTY = -213605; // 设备名不能为空

	@ErrorLink(resId = "EE_CLOUD_DEV_USERNAME_INVALID")
	public final static int EE_CLOUD_DEV_USERNAME_INVALID = -213606; // 设备用户名格式不正确，含关键字

	@ErrorLink(resId = "EE_CLOUD_DEV_PASSWORD_INVALID")
	public final static int EE_CLOUD_DEV_PASSWORD_INVALID = -213607; // 设备密码格式不正确，含关键字

	@ErrorLink(resId = "EE_CLOUD_DEV_NAME_INVALID")
	public final static int EE_CLOUD_DEV_NAME_INVALID = -213608; // 设备名称格式不正确，含关键字

	@ErrorLink(resId = "EE_CLOUD_PARAM_INVALID")
	public final static int EE_CLOUD_PARAM_INVALID = -213610; // 参数异常（dev.mac传入的参数不对）

	@ErrorLink(resId = "EE_CLOUD_USERNAME_NOTEXIST")
	public final static int EE_CLOUD_USERNAME_NOTEXIST = -213611; // 用户名不存在(获取设备列表")

	@ErrorLink(resId = "EE_CLOUD_SERVICE_ACTIVATE")
	public final static int EE_CLOUD_SERVICE_ACTIVATE = -213620; // 开通失败

	@ErrorLink(resId = "EE_CLOUD_SERVICE_UNAVAILABLE")
	public final static int EE_CLOUD_SERVICE_UNAVAILABLE = -213621; // 没有开通云存储（1、用户不存在；2、用户没有开通//
																	// ）

	@ErrorLink(resId = "EE_CLOUD_AUTHENTICATION_FAILURE")
	public final static int EE_CLOUD_AUTHENTICATION_FAILURE = -213630; // 验证授权失败（用户名或密码错误）

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_CHECK_USER_REGISTE_CODE = -213700; // 服务响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_CHECK_USER_REGISTE_CODE1 = -213702; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_CHECK_USER_REGISTE_CODE2 = -213703; // 参数错误
	@ErrorLink(resId = "already_register_username")
	public final static int EE_AS_CHECK_USER_REGISTE_CODE3 = -213706; // 用户名已被注册

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SYS_LOGOUT_CODE = -214100; // 服务响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SYS_LOGOUT_CODE1 = -214102; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_SYS_LOGOUT_CODE2 = -214103; // 参数错误

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SYS_NO_VALIDATED_REGISTER_CODE = -214200; // 服务器响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SYS_NO_VALIDATED_REGISTER_CODE1 = -214202; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_SYS_NO_VALIDATED_REGISTER_CODE2 = -214203; // 参数错误
	@ErrorLink(resId = "already_register_username")
	public final static int EE_AS_SYS_NO_VALIDATED_REGISTER_CODE3 = -214206; // 用户名已被注册
	@ErrorLink(resId = "Register_Failure")
	public final static int EE_AS_SYS_NO_VALIDATED_REGISTER_CODE4 = -214210; // 注册失败
	@ErrorLink(resId = "User_Exsit")
	public final static int EE_AS_SYS_NO_VALIDATED_REGISTER_CODE5 = -604018; // 用户名已注册
	@ErrorLink(resId = "Device_NotExist")
	public final static int EE_AS_SYS_DEV_NOTEXIT = -604118;//设备不存在了 已经被移除了
	
	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SYS_GET_USER_INFO_CODE = -214300; // 服务器响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SYS_GET_USER_INFO_CODE1 = -214302; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_SYS_GET_USER_INFO_CODE2 = -214303; // 参数错误
	@ErrorLink(resId = "register_username_not_exist")
	public final static int EE_AS_SYS_GET_USER_INFO_CODE3 = -214306; // 用户名不存在
	@ErrorLink(resId = "Get_F")
	public final static int EE_AS_SYS_GET_USER_INFO_CODE4 = -214310; // 获取失败
	@ErrorLink(resId = "Invalid_Password")
	public final static int EE_AS_SYS_GET_USER_INFO_CODE5 = -214313; // 用户密码错误

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE = -214400; // 服务器响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE1 = -214402; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE2 = -214403; // 参数错误
	@ErrorLink(resId = "already_binding_mobile")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE3 = -214404; // 手机号码已被绑定
	@ErrorLink(resId = "forget_code_send_more3")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE4 = -214405; // 超出短信每天发送次数限制
	@ErrorLink(resId = "register_username_not_exist")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE5 = -214406; // 用户名不存在
	@ErrorLink(resId = "sms_send_failure")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE6 = -214410; // 发送失败
	@ErrorLink(resId = "Invalid_Password")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE7 = -214413; // 用户密码错误
	@ErrorLink(resId = "EE_AS_PHONE_CODE5")
	public final static int EE_AS_SYS_SEND_BINDING_PHONE_CODE8 = -214417; // 120秒之内只能发送一次

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE = -214500; // 服务器响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE1 = -214502; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE2 = -214503; // 参数错误
	@ErrorLink(resId = "already_binding_mobile")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE3 = -214504; // 手机号码已被绑定
	@ErrorLink(resId = "register_username_not_exist")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE4 = -214506; // 用户名不存在
	@ErrorLink(resId = "register_code_error")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE5 = -214507; // 验证码错误
	@ErrorLink(resId = "binding_failure")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE6 = -214510; // 绑定失败a
	@ErrorLink(resId = "Invalid_Password")
	public final static int EE_AS_SYS_BINDING_PHONE_CODE7 = -214513; // 用户密码错误

	@ErrorLink(resId = "register_username_not_exist")
	public final static int EE_ERROR_CODE1 = -21;// 用户名错误
	@ErrorLink(resId = "Invalid_Password")
	public final static int EE_ERROR_CODE2 = -22;// 用户名错误

	@ErrorLink(resId = "EE_AS_SEND_EMAIL_CODE")
	public final static int EE_AS_SEND_EMAIL_CODE = -213100; // 服务响应失败
	public final static int EE_AS_SEND_EMAIL_CODE1 = -213102; // 接口验证失败
	public final static int EE_AS_SEND_EMAIL_CODE2 = -213103; // 参数错误

	@ErrorLink(resId = "EE_EMAIL_HAS_REGISTERED_CODE")
	public final static int EE_EMAIL_HAS_REGISTERED_CODE = -213108;// 邮箱被注册了
	@ErrorLink(resId = "sms_send_failure")
	public final static int EE_AS_SEND_EMAIL_CODE4 = -213110; // 发送失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_REGISTE_BY_EMAIL_CODE = -213200; // 服务响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_REGISTE_BY_EMAIL_CODE1 = -213202; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_REGISTE_BY_EMAIL_CODE2 = -213203; // 参数错误
	@ErrorLink(resId = "already_register_username")
	public final static int EE_AS_REGISTE_BY_EMAIL_CODE3 = -213206; // 用户名已被注册
	@ErrorLink(resId = "register_code_error")
	public final static int EE_AS_REGISTE_BY_EMAIL_CODE4 = -213207; // 注册码验证错误
	@ErrorLink(resId = "EE_AS_REGISTE_BY_EMAIL_CODE5")
	public final static int EE_AS_REGISTE_BY_EMAIL_CODE5 = -213208; // 邮箱已被注册
	@ErrorLink(resId = "register_failure")
	public final static int EE_AS_REGISTE_BY_EMAIL_CODE6 = -213210; // 注册失败

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SEND_EMAIL_FOR_CODE = -213300; // 服务响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SEND_EMAIL_FOR_CODE1 = -213302; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_SEND_EMAIL_FOR_CODE3 = -213303; // 参数错误
	@ErrorLink(resId = "sms_send_failure")
	public final static int EE_AS_SEND_EMAIL_FOR_CODE4 = -213310; // 发送失败
	@ErrorLink(resId = "EE_AS_SEND_EMAIL_FOR_CODE5")
	public final static int EE_AS_SEND_EMAIL_FOR_CODE5 = -213314; // 邮箱不存在
	@ErrorLink(resId = "EE_AS_SEND_EMAIL_FOR_CODE6")
	public final static int EE_AS_SEND_EMAIL_FOR_CODE6 = -213316; // 邮箱和用户名不匹配
	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_CHECK_CODE_FOR_EMAIL = -213400; // 服务响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_CHECK_CODE_FOR_EMAIL1 = -213402; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_CHECK_CODE_FOR_EMAIL2 = -213403; // 参数错误
	@ErrorLink(resId = "register_code_error")
	public final static int EE_AS_CHECK_CODE_FOR_EMAIL3 = -213407; // 验证码错误
	@ErrorLink(resId = "EE_AS_SEND_EMAIL_FOR_CODE5")
	public final static int EE_AS_CHECK_CODE_FOR_EMAIL4 = -213414; // 邮箱不存在

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_RESET_PWD_BY_EMAIL = -213500; // 服务响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_RESET_PWD_BY_EMAIL1 = -213502; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_RESET_PWD_BY_EMAIL2 = -213503; // 参数错误
	@ErrorLink(resId = "EE_AS_RESET_ERROR")
	public final static int EE_AS_RESET_PWD_BY_EMAIL3 = -213513; // 重置失败
	@ErrorLink(resId = "EE_AS_RESET_PWD_BY_EMAIL4")
	public final static int EE_AS_RESET_PWD_BY_EMAIL4 = -213514; // 手机号码或邮箱不存在

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SYS_SEND_BINDING_EMAIL_CODE = -214600; // 服务器响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SYS_SEND_BINDING_EMAIL_CODE1 = -214602; // 接口验证失败
	@ErrorLink(resId = "EE_CLOUD_USERNAME_NOTEXIST")
	public final static int EE_AS_SYS_SEND_BINDING_EMAIL_CODE2 = -214606; // 用户名不存在
	@ErrorLink(resId = "EE_AS_REGISTE_BY_EMAIL_CODE5")
	public final static int EE_AS_SYS_SEND_BINDING_EMAIL_CODE3 = -214608; // 该邮箱已被绑定
	@ErrorLink(resId = "sms_send_failure")
	public final static int EE_AS_SYS_SEND_BINDING_EMAIL_CODE4 = -214610; // 发送失败
	@ErrorLink(resId = "EE_CLOUD_AUTHENTICATION_FAILURE")
	public final static int EE_AS_SYS_SEND_BINDING_EMAIL_CODE5 = -214613; // 用户密码错误

	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE = -214700; // 服务器响应失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE0")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE1 = -214702; // 接口验证失败
	@ErrorLink(resId = "EE_AS_PHONE_CODE1")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE2 = -214703; // 参数错误
	@ErrorLink(resId = "EE_CLOUD_USERNAME_NOTEXIST")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE3 = -214706; // 用户名不存在
	@ErrorLink(resId = "register_code_error")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE4 = -214707; // 验证码错误
	@ErrorLink(resId = "EE_AS_REGISTE_BY_EMAIL_CODE5")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE5 = -214708; // 该邮箱已被绑定
	@ErrorLink(resId = "binding_failure")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE6 = -214710; // 绑定失败
	@ErrorLink(resId = "EE_CLOUD_AUTHENTICATION_FAILURE")
	public final static int EE_AS_SYS_BINDING_EMAIL_CODE7 = -214713; // 用户密码错误
	@ErrorLink(resId = "EE_AS_GET_PUBLIC_DEV_LIST_CODE")
	public final static int EE_AS_EDIT_USER_PHOTOS_CODE = -213900; // 服务器响应失败
	@ErrorLink(resId = "EE_DSS_NOT_SUP_MAIN")
	public final static int EE_DSS_NOT_SUP_MAIN = -210008;
	@ErrorLink(resId = "EE_TPS_NOT_SUP_MAIN")
	public final static int EE_TPS_NOT_SUP_MAIN = -210009;
	@ErrorLink(resId = "Device_NotExist")
	public final static int EE_MNETSDK_DEV_IS_OFFLINE = -400008;

	@ErrorLink(resId = "EE_MNETSDK_NOTSUPPORT")
	public final static int EE_MNETSDK_NOTSUPPORT = -400009;   // 设备不支持此功能

	@ErrorLink(resId = "EE_MENTSDK_NOFILEFOUND")
	public final static int EE_MENTSDK_NOFILEFOUND = -400010;

	@ErrorLink(resId = "EE_MNETSDK_STORAGE_IS_FULL")
	public final static int EE_MNETSDK_STORAGE_IS_FULL = -400101; // 设备存储已满

	@ErrorLink(resId = "EE_MNETSDK_TALK_ALAREADY_START")
	public final static int EE_MNETSDK_TALK_ALAREADY_START = -400012; // 对讲已开启

	@ErrorLink(resId = "EE_MNETSDK_DEV_PTL")
	public final static int EE_MNETSDK_DEV_PTL = -400013; // DevPTL NULL

	@ErrorLink(resId = "EE_MNETSDK_BACKUP_FAILURE")
	public final static int EE_MNETSDK_BACKUP_FAILURE = -400014; // 备份到u盘失败

	@ErrorLink(resId = "EE_MNETSDK_NODEVICE")
	public final static int EE_MNETSDK_NODEVICE = -400015; // 无存储设备(u盘)或设备没在录像

	@ErrorLink(resId = "EE_MNETSDK_USEREXIST")
	public final static int EE_MNETSDK_USEREXIST = -400016;

	@ErrorLink(resId = "EE_MNETSDK_CAPTURE_PIC_FAILURE")
	public final static int EE_MNETSDK_CAPTURE_PIC_FAILURE = -400017; // 抓图失败

	@ErrorLink(resId = "EE_MNETSDK_TALK_NOT_START")
	public final static int  EE_MNETSDK_TALK_NOT_START = -400100;   //设备错误码往后写

	@ErrorLink(resId = "EE_NOT_FOUND_ALARM_INFO")
	public final static int EE_NOT_FOUND_ALARM_INFO = -222400;

	@ErrorLink(resId = "EE_DSS_MINOR_STREAM_DISABLE")
	public final static int EE_DSS_MINOR_STREAM_DISABLE = -215120;//DSS 服务器禁止此种码流
	

	@ErrorLink(resId = "EE_DSS_NO_VIDEO")
	public final static int EE_DSS_NO_VIDEO = -215121;//NVR 前端未连接视频源

	@ErrorLink(resId = "EE_DSS_DEVICE_NOT_SUPPORT")
	public final static int EE_DSS_DEVICE_NOT_SUPPORT = -215122;//前端不支持此种码流
	
	@ErrorLink(resId = "EE_DSS_BAD_REQUEST")
	public final static int EE_DSS_BAD_REQUEST = -215130;

	// 媒体视频链接数达到最大，访问受限
	@ErrorLink(resId = "MEDIA_CONNET_REACHED_MAX")
	public final static int MEDIA_CONNET_REACHED_MAX  = -215131;

	//报警授权码错误
	@ErrorLink(resId = "EE_ALARM_CHECK_AUTHCODE_FAILED")
	public final static int EE_ALARM_CHECK_AUTHCODE_FAILED = -221201;

	//不支持（比较在中国界内不支持Google报警）
	@ErrorLink(resId = "EE_ALARM_NOT_SUPPORTED")
	public final static int EE_ALARM_NOT_SUPPORTED = -221202;

	@ErrorLink(resId = "EE_DSS_XMCloud_Request")
	public final static int EE_DSS_XMCloud_Request = -215103;

	@ErrorLink(resId = "EE_DSS_XMCloud_InvalidStream")
	public final static int EE_DSS_XMCloud_InvalidStream = -215102;

	@ErrorLink(resId = "EE_SERVER_INTERNAL_ERROR")
	public final static int EE_SERVER_INTERNAL_ERROR = -99985;

	@ErrorLink(resId = "EE_ACCOUNT_USERNAME_PWD_ERROR")
	public final static int EE_ACCOUNT_USERNAME_PWD_ERROR = -604034; // 用户名密码错误，标示用户未绑定雄迈账户，应跳转到绑定用户界面

	// 一下是FunSDK库新加的
	@ErrorLink(resId = "EE_CLOUD_AUTHENTICATION_FAILURE")
	public static final int EE_ACCOUNT_HTTP_USERNAME_PWD_ERROR = -604000;// 4000
																			// :
																			// 用户名或密码错误
	@ErrorLink(resId = "register_code_error")
	public static final int EE_ACCOUNT_VERIFICATION_CODE_ERROR = -604010;// 4010
																			// :
																			// 验证码错误
	@ErrorLink(resId = "pass_notsame")
	public static final int EE_ACCOUNT_PASSWORD_NOT_SAME = -604011;// 4011 :
																	// 密码不一致
	@ErrorLink(resId = "EE_USER_EXIST")
	public static final int EE_ACCOUNT_USERNAME_HAS_BEEN_REGISTERED = -604012;// 4012
																				// :
	@ErrorLink(resId = "EE_ACCOUNT_USERNAME_IS_EMPTY")																			// 用户名已被注册
	public static final int EE_ACCOUNT_USERNAME_IS_EMPTY = -604013;// 4013 :
	@ErrorLink(resId = "EE_ACCOUNT_PASSWORD_IS_EMPTY")																// 用户名为空
	public static final int EE_ACCOUNT_PASSWORD_IS_EMPTY = -604014;// 4014 :
	@ErrorLink(resId = "EE_ACCOUNT_COMFIRMPWD_IS_EMPTY")																// 密码为空
	public static final int EE_ACCOUNT_COMFIRMPWD_IS_EMPTY = -604015;// 4015 :
	@ErrorLink(resId = "EE_ACCOUNT_PHONE_IS_EMPTY")																	// 确认密码为空
	public static final int EE_ACCOUNT_PHONE_IS_EMPTY = -604016;// 4016 : 手机号为空
	@ErrorLink(resId = "EE_ACCOUNT_USERNAME_FORMAT_NOT_CORRECT")
	public static final int EE_ACCOUNT_USERNAME_FORMAT_NOT_CORRECT = -604017;// 4017
																				// :
																				// 用户名格式不正确
	@ErrorLink(resId = "forget_new_pass_format_error")
	public static final int EE_ACCOUNT_PASSWORD_FORMAT_NOT_CORRECT = -604018;// 4018
																				// :// 密码格式不正确
	@ErrorLink(resId = "forget_new_pass_format_error")
	public static final int EE_ACCOUNT_COMFIRMPWD_FORMAT_NOT_CORRECT = -604019;// 4019
																				// :// 确认密码格式不正确
	@ErrorLink(resId = "EE_ACCOUNT_PHONE_FORMAT_NOT_CORRECT")
	public static final int EE_ACCOUNT_PHONE_FORMAT_NOT_CORRECT = -604020;// 4020
																			// :
	@ErrorLink(resId = "EE_AS_PHONE_CODE2")										// 手机号格式不正确
	public static final int EE_ACCOUNT_PHONE_IS_EXIST = -604021;// 4021 : 手机号已存在
	@ErrorLink(resId = "EE_AS_RESET_PWD_BY_EMAIL4")
	public static final int EE_ACCOUNT_PHONE_NOT_EXSIT = -604022;// 4022 :
																	// 手机号不存在
	@ErrorLink(resId = "EE_EMAIL_HAS_REGISTERED_CODE")
	public static final int EE_ACCOUNT_EMAIL_IS_EXIST = -604023;// 4023 : 邮箱已存在
	@ErrorLink(resId = "EE_AS_RESET_PWD_BY_EMAIL4")
	public static final int EE_ACCOUNT_EMAIL_NOT_EXIST = -604024;// 4024 : 邮箱不存在
	@ErrorLink(resId = "User_not_exist")
	public static final int EE_ACCOUNT_USER_NOT_EXSIT = -604025;// 4025 : 用户不存在
	@ErrorLink(resId = "Invalid_Password")
	public static final int EE_ACCOUNT_OLD_PASSWORD_ERROR = -604026;// 4026 :
																	// 原始密码错误
	@ErrorLink(resId = "Modify_pwd_failed")
	public static final int EE_ACCOUNT_MODIFY_PASSWORD_ERROR = -604027;// 4027 :
																		// 修改密码失败
	public static final int EE_ACCOUNT_USERID_IS_EMPTY = -604029; //4029 : 用户ID为空
	public static final int EE_ACCOUNT_VERIFICATION_CODE_IS_EMPTY = -604030; //4030 : 验证码为空
	public static final int EE_ACCOUNT_EMAIL_IS_EMPTY = -604031; //4031 : 邮箱为空
	public static final int EE_ACCOUNT_EMAIL_FORMATE_NOT_CORRECT = -604032; //4032 : 邮箱格式不正确
	public static final int EE_ACCOUNT_USER_NOT_WX_BIND = -604034; //4034: 用户未绑定(用户名密码错误，标示用户未绑定雄迈账户，应跳转到绑定用户界面)
	public static final int EE_ACCOUNT_USER_HAS_WX_BIND = -604035; //4035: 用户已绑定
	public static final int EE_ACCOUNT_USER_FAIL_WX_BIND = -604036; //4036: 用户绑定失败
	public static final int EE_ACCOUNT_USER_FAIL_PHONE_BIND = -604037; //4037: 手机绑定失败
	public static final int EE_ACCOUNT_USER_FAIL_MAIL_BIND = -604038; //4037: 邮箱绑定失败
	public static final int EE_ACCOUNT_NOT_OPENED = -604600; //4600: 功能未开通

	//设备相关
	public static final int EE_ACCOUNT_DEVICE_ILLEGAL_NOT_ADD = -604100; //4100 : 设备非法不允许添加
	@ErrorLink(resId = "search_dev_result_exist")
	public static final int EE_ACCOUNT_DEVICE_ALREADY_EXSIT = -604101; // 4101 :
																		// 设备已经存在
	public static final int EE_ACCOUNT_DEVICE_DELETE_FAIL = -604102; //4102 : 删除设备失败
	public static final int EE_ACCOUNT_DEVICE_CHANGE_IFNO_FAIL = -604103; //4103 : 设备信息修改失败
	public static final int EE_ACCOUNT_DEVICE_UUID_ILLEGAL = -604104; //4104 : 设备uuid参数异常
	public static final int EE_ACCOUNT_DEVICE_USERNAME_ILLEGAL = -604105; //4105 : 设备用户名参数异常
	public static final int EE_ACCOUNT_DEVICE_PASSWORD_ILLEGAL = -604106; //4106 : 设备密码参数异常
	public static final int EE_ACCOUNT_DEVICE_PORT_ILLEGAL = -604107; //4107 : 设备端口参数异常
	public static final int EE_ACCOUNT_DEVICE_EXTEND_ILLEGAL = -604108; //4108 : 设备扩展字段参数异常
	@ErrorLink(resId = "EE_NOT_MASTER_ACCOUNT")
	public static final int EE_NOT_MASTER_ACCOUNT = -604117; //当前账户不是当前设备的主账户
	//授权系统
	public static final int EE_ACCOUNT_ADD_OPEN_APP_FAIL = -604200; //4200 : 添加授权失败
	public static final int EE_ACCOUNT_UPDATE_OPEN_APP_FAIL = -604201; //4201 : 修改授权失败
	public static final int EE_ACCOUNT_DELETE_OPEN_APP_FAIL = -604202; //4202 : 删除授权失败
	public static final int EE_ACCOUNT_SYN_TYPE_APP_FAIL = -604203; //4203 : 单个授权同步失败(原因可能是type参数不对,或者云产品线未返回)

	//发送邮件授权码
	public static final int EE_ACCOUNT_SEND_CODE_FAIL  = -604300; //4300 : 发送失败
	public static final int EE_ACCOUNT_CANCELLATION_CODE = -604302;		// 注销账号需要验证码
	//发送手机授权码
	public static final int EE_ACCOUNT_MESSAGE_INTERFACE_CHECK_ERROR  = -604400; //4400 : 短信接口验证失败，请联系我们
	public static final int EE_ACCOUNT_MESSAGE_INTERFACE_PARM_ERROR = -604401; //4401 : 短信接口参数错误，请联系我们
	@ErrorLink(resId = "EE_ACCOUNT_MESSAGE_TIME_MORE_THAN_THREE")
	public static final int  EE_ACCOUNT_MESSAGE_TIME_MORE_THAN_THREE = -604402; //短信发送超过次数，每个手机号一天只能发送

	@ErrorLink(resId = "sms_send_failure")
	public static final int EE_SendCode_ERROR = -604403;  //发送验证码失败

	@ErrorLink(resId = "EE_AS_PHONE_CODE5")
	public static final int EE_ACCOUNT_MESSAGE_SEND_OFTEN = -604404;// 120秒之内只能发送一次
	public static final int EE_ACCOUNT_MESSAGE_NONE_FAIL = -604405; //4405 : 未知错误？？

	//开放平台接口
	public static final int EE_ACCOUNT_OPEN_USER_LIST_NULL = -604500; //4500 : 未查到用户列表或用户列表为空
	public static final int EE_ACCOUNT_OPEN_DEVICE_LIST_NULL = -604502; //4502 : 未查到设备列表或设备列表为空
	public static final int EE_ACCOUNT_RESET_OPEN_APP_SECRET_FAIL = -604503; //4503 : 重置 app secret 失败

	//服务器异常错误
	public static final int EE_ACCOUNT_HTTP_SERVER_ERROR = -605000; //5000 : 服务器故障
	public static final int EE_ACCOUNT_CERTIFICATE_NOT_EXIST = -605001; //5001 : 证书不存在
	public static final int EE_ACCOUNT_HTTP_HEADER_ERROR = -605002; //5002 : 请求头信息错误
	public static final int EE_ACCOUNT_CERTIFICATE_FAILURE = -605003; //5003 : 证书失效
	public static final int EE_ACCOUNT_ENCRYPT_CHECK_FAILURE = -605004; //5004 : 生成密钥校验错误
	public static final int EE_ACCOUNT_PARMA_ABNORMAL = -605005; //5005 : 参数异常
	public static final int EE_ACCOUNT_CONNECTION_FAILURE = -605006; //5006 : 连接失败
	public static final int EE_ACCOUNT_NODE_ERROR = -605007; //5007 : 未知错误
	public static final int EE_ACCOUNT_IP_NOT_ALLOWED = -605008; //5008 : ip地址不允许接入
    @ErrorLink(resId = "EE_ACCOUNT_DECRYPT_ERROR")
	public static final int EE_ACCOUNT_DECRYPT_ERROR = -605009; //5009 : 解密错误，说明用户名密码非法
	public static final int EE_ACCOUNT_CERTIFICATE_BLACK = -605010; //5010 : 证书黑名单

	public static final int EE_ACCOUNT_LOGINTYPE_INVALID = -66000; //6000 : 无效登录方式？
	public static final int EE_ACCOUNT_NEW_PWD_FORMAT_NOT_CORRECT = -661427; //1427 : 新密码格式不正确
	public static final int EE_ACCOUNT_USER_IS_NOT_EXSIT = -661412; //1412 : 用户名不存在

	public static final int EE_DVR_ERROR_BEGIN = -70000; // 透转DVR的错误值
	//设备通用错误
	public static final int EE_DVR_USER_NOT_EXIST = -70113; //113 : 该用户不存在
	public static final int EE_DVR_GROUP_EXIST = -70114; //114 : 该用户组已经存在
	public static final int EE_DVR_GROUP_NOT_EXIST = -70115; //114 : 该用户组不存在
	public static final int EE_DVR_NO_PTZ_PROTOCOL= -70118; //118 : 未设置云台协议
	public static final int EE_DVR_MEDIA_CHN_NOTCONNECT	= -70121; //121 : 数字通道未连接
	public static final int EE_DVR_TCPCONNET_REACHED_MAX = -70123; //123 : Tcp视频链接达到最大，不允许新的Tcp视频链接
	public static final int EE_DVR_LOGIN_ARGO_ERROR	= -70124; //124 : 用户名和密码的加密算法错误
	public static final int EE_DVR_LOGIN_NO_ADMIN = -70125; //125 : 创建了其它用户，不能再用admin登陆
	public static final int EE_DVR_LOGIN_TOO_FREQUENTLY	= -70126; //126 : 登陆太频繁，稍后重试
	public static final int EE_DVR_NAS_EXIST = -70130; //130 : NAS地址已存在
	public static final int EE_DVR_NAS_ALIVE = -70131; //131 : 路径正在被使用，无法操作
	public static final int EE_DVR_NAS_REACHED_MAX = -70132; //132 : NAS已达到支持的最大值,不允许继续添加
	public static final int EE_DVR_CONSUMER_OPR_WRONG_KEY = -70140; //140 : 消费类产品遥控器绑定按的键错了
	public static final int EE_DVR_NEED_REBOOT = -70150; //150 : 成功，设备需要重启
	public static final int EE_DVR_NO_SD_CARD = -70153; //153 ：没有SD卡或硬盘
	public static final int EE_DVR_CONSUMER_OPR_SEARCHING = -70162; //162 : 设备正在添加过程中
	public static final int EE_DVR_CPPLUS_USR_PSW_ERR = -70162; //163 : APS客户特殊的密码错误返回值

	@ErrorLink(resId = "Network_Error")
	public static final int EE_DVR_XMSDK_UNKOWN  = -79001;   // 未知错误
	@ErrorLink(resId = "Network_Error")
	public static final int EE_DVR_XMSDK_INIT_FAILED = -79002;	// 查询服务器失败
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_INVALID_ARGUMENT = -79003; 	// 参数错误
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_OFFLINE = -79004; 	// 离线
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_NOT_CONNECT_TO_SERVER	= -79005; 	// 无法连接到服务器
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_NOT_REGISTER_TO_SERVER	= -79006;	// 向连接服务器注册失败
	@ErrorLink(resId = "MEDIA_CONNET_REACHED_MAX")
	public static final int	EE_DVR_XMSDK_CONNECT_IS_FULL = -79007;	// 连接数已满
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_NOT_CONNECTED = -79008;	// 未连接
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_CONNECT_IS_TIMEOUT = -79020;	// 连接超时
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_CONNECT_REFUSE	= -79021;	// 连接服务器拒绝连接请求
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_QUERY_STATUS_TIMEOUT = -79022;	// 查询状态超时
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_QUERY_WANIP_TIMEOUT = -79023;	// 查询外网信息超时
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_HANDSHAKE_TIMEOUT = -79024;	// 握手超时
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_QUERY_SERVER_TIMEOUT = -79025;	// 查询服务器失败
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_HEARTBEAT_IS_TIMEOUT = -79026;	// 心跳超时
	@ErrorLink(resId = "Network_Error")
	public static final int	EE_DVR_XMSDK_MSGSVR_ERRNO_DISCONNECT = -79027;	// 连接断开

	//网络操作错误号
	public static final int EE_COMMAND_INVALID = -70501; //501 : 命令不合法
	public static final int EE_UPGRADE_ALAREADY_START = -70510; //510 : 已经开始升级
	public static final int EE_UPGRADE_NOT_START = -70511; //511 : 未开始升级
	public static final int EE_UPGRADE_FAILED = -70513; //513 : 升级失败
	public static final int EE_UPGRADE_SUCCESS = -70514; //514 : 升级成功
	public static final int EE_SET_DEFAULT_FAILED = -70520; //520 : 还原默认失败
	public static final int EE_SET_DEFAULT_REBOOT = -70521; //521 : 需要重启设备
	public static final int EE_SET_DEFAULT_VALIDATE_ERROR = -70522; //522 : 默认配置非法

}
