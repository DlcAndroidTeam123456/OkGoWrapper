package cn.dlc.commonlibrary.okgo.converter;

/**
 * 原样输出json文本的转换器
 */
public class MyStringConvert extends MyConverter<String> {

    public static final MyStringConvert INSTANCE = new MyStringConvert();

    /**
     * 原样输出json文本的转换器
     */
    public MyStringConvert() {
        super(String.class);
    }

    @Override
    public String convert(String stringResponse) throws Throwable {
        return stringResponse;
    }
}
