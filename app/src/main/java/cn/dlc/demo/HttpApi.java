package cn.dlc.demo;

import cn.dlc.commonlibrary.okgo.OkGoWrapper;
import cn.dlc.commonlibrary.okgo.converter.MyStringConvert;
import io.reactivex.Observable;

/**
 * 用来复制粘贴做模板的类，用来参考的
 */
public class HttpApi {

    private final OkGoWrapper mOkGoWrapper;

    private HttpApi() {
        mOkGoWrapper = OkGoWrapper.instance();
    }

    private static class InstanceHolder {
        private static final HttpApi sInstance = new HttpApi();
    }

    public static HttpApi get() {
        return InstanceHolder.sInstance;
    }

    //rx邮箱注册,用来看的，不要用
    public Observable<String> rxHttpsUrl(String url) {
        return mOkGoWrapper.rxPost(url, null, MyStringConvert.INSTANCE);
    }
}
