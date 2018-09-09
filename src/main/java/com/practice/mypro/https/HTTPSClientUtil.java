package com.practice.mypro.https;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
public class HTTPSClientUtil {
//	@RequestMapping("/getWeiXinResponse")
	public static String doGet(String url,Map<String,String> paramMap) {
		String responseStr = "";
		//读取服务器的响应内容并显示
		try {
			URL reqURL = new URL("https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code" ); //创建URL对象
			HttpsURLConnection httpsConn = (HttpsURLConnection)reqURL.openConnection();
			/*下面这段代码实现向Web页面发送数据，实现与网页的交互访问
			httpsConn.setDoOutput(true);
			OutputStreamWriter out = new OutputStreamWriter(huc.getOutputStream(), "8859_1");
			out.write( "……" );
			out.flush();
			out.close();
			*/
			InputStreamReader insr = new InputStreamReader(httpsConn.getInputStream());
			BufferedReader bf = new BufferedReader(insr);
			
			while((responseStr=bf.readLine()) != null) {
				System.out.println(responseStr+"&&&&&&&&&&&&&&&&");
				responseStr += responseStr;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseStr;
		
	}
}
