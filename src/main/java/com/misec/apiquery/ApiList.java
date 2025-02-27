package com.misec.apiquery;

/**
 * @author Junzhou Liu
 * @create 2020/10/11 3:40
 */
public class ApiList {

    public static String PushPlus = "http://www.pushplus.plus/send";
    public static String ServerPush = "https://sc.ftqq.com/";
    public static String ServerPushV2 = "https://sctapi.ftqq.com/";
    public static String ServerPushTelegram = "https://api.telegram.org/bot";
    public static String LOGIN = "https://api.bilibili.com/x/web-interface/nav";
    public static String Manga = "https://manga.bilibili.com/twirp/activity.v1.Activity/ClockIn";
    public static String AvShare = "https://api.bilibili.com/x/web-interface/share/add";
    public static String CoinAdd = "https://api.bilibili.com/x/web-interface/coin/add";
    public static String isCoin = "https://api.bilibili.com/x/web-interface/archive/coins";
    public static String getRegionRanking = "https://api.bilibili.com/x/web-interface/ranking/region";
    public static String reward = "https://api.bilibili.com/x/member/web/exp/reward";
    public static String weixingPush = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=";

    /**
     * 查询获取已获取的投币经验
     */
    public static String needCoin = "https://www.bilibili.com/plus/account/exp.php";

    public static String needCoinNew = "https://api.bilibili.com/x/web-interface/coin/today/exp";

    /**
     * 硬币换银瓜子
     */
    public static String silver2coin = "https://api.live.bilibili.com/xlive/revenue/v1/wallet/silver2coin";

    /**
     * 查询银瓜子兑换状态
     */
    public static String getSilver2coinStatus = "https://api.live.bilibili.com/xlive/revenue/v1/wallet/myWallet?need_bp=1&need_metal=1&platform=pc";

    /**
     * 上报观看进度
     */
    public static String videoHeartbeat = "https://api.bilibili.com/x/click-interface/web/heartbeat";

    /**
     * 查询主站硬币余额
     */
    public static String getCoinBalance = "https://account.bilibili.com/site/getCoin";

    /**
     * 充电请求
     */
    public static String autoCharge = "https://api.bilibili.com/x/ugcpay/web/v2/trade/elec/pay/quick";

    /**
     * 充电留言
     */
    public static String chargeComment = "https://api.bilibili.com/x/ugcpay/trade/elec/message";


    public static String chargeQuery = "https://api.bilibili.com/x/ugcpay/web/v2/trade/elec/panel";

    public static String queryUserName = "https://api.bilibili.com/x/space/acc/info";

    /**
     * 领取大会员福利
     */
    public static String vipPrivilegeReceive = "https://api.bilibili.com/x/vip/privilege/receive";

    /**
     * 领取大会员漫画福利
     */
    public static String mangaGetVipReward = "https://manga.bilibili.com/twirp/user.v1.User/GetVipReward";
    /**
     * 直播签到
     */
    public static final String LIVE_CHECKING = "https://api.live.bilibili.com/xlive/web-ucenter/v1/sign/DoSign";

    public static String queryDynamicNew = "https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/dynamic_new";

    public static String videoView = "https://api.bilibili.com/x/web-interface/view";

    /**
     * 漫画阅读
     */
    public static String mangaRead = "https://manga.bilibili.com/twirp/bookshelf.v1.Bookshelf/AddHistory";
    /**
     *
     */
    public static String getBvidByCreate = "https://api.bilibili.com/x/space/arc/search";
    public static String getCoinLog ="https://api.bilibili.com/x/member/web/coin/log?jsonp=jsonp";


    /**
     * 赛事预测部分
     */
    public static String queryQuestions = "https://api.bilibili.com/x/esports/guess/collection/question";

    public static String queryMatchInfo = "https://api.bilibili.com/x/esports/guess/collection/statis";
    public static String doAdd = "https://api.bilibili.com/x/esports/guess/add";
}
