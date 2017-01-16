package jsonceshi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		  json2JsonObjectM1();//将Json文本数据信息转换为JsonObject对象，然后利用键值对的方式获取信息  
	        json2BeanM2();//将Json文本数据转换为JavaBean数据！  
		
		
	}
	/** 
     * 将Json文本数据信息转换为JsonObject对象，然后利用键值对的方式获取信息 
     */  
    private static void json2JsonObjectM1() {  
        //一个JsonObject文本数据  
        String s = "{\"name\":\"liuzhao\"}";  
        //将JsonObject数据转换为Json  
        JSONObject object = JSON.parseObject(s);  
        //利用键值对的方式获取到值  
        System.out.println(object.get("name"));  
        /** 
         * 打印： 
         * liuzhao 
         */  
    }  
    
    private static void json2BeanM2() {  
        String s = "{\"id\":\"0375\",\"city\":\"平顶山\"}";  
        //一个简单方便 的方法将Json文本信息转换为JsonObject对象的同时转换为JavaBean对象！  
        Weibo weibo = JSON.parseObject(s, Weibo.class);//Weibo类在下边定义  
        System.out.println(weibo.getId());  
        System.out.println(weibo.getCity());  
        //打印的结果     0375  
        //              平顶山  
    }  

}
