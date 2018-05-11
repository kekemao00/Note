package fanggeOTAdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class HttpURLConnectionPost {

	public static void main(String[] yaogenigedapiyanzi) {
		// System.out.println(doJsonPost("http://opapi.xflqv.cn/app/queryCurrentAppVersion",
		// "{\"appType\":8}"));
		String jsonOTA = doJsonPost("http://opapi.xflqv.cn/app/queryCurrentAppVersion", "{\"appType\":8}");
		Gson gson = new Gson();
		Obj obj = gson.fromJson(jsonOTA, Obj.class);
		System.out.println(obj.toString());
	}

	public static String doJsonPost(String urlPath, String Json) {
		String result = "";
		BufferedReader reader = null;
		try {
			URL url = new URL(urlPath);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("Charset", "UTF-8");
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			conn.setRequestProperty("accept", "application/json");
			if (Json != null) {
				byte[] writebytes = Json.getBytes();
				conn.setRequestProperty("Content-Length", String.valueOf(writebytes.length));
				OutputStream outwritestream = conn.getOutputStream();
				outwritestream.write(Json.getBytes());
				outwritestream.flush();
				outwritestream.close();
			}
			if (conn.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				result = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

}

class Obj {
	String code;
	String msg;
	String map;
	String innerResult;
	Data data;

	@Override
	public String toString() {
		return "Obj [code=" + code + ", msg=" + msg + ", map=" + map + ", innerResult=" + innerResult + ", data=" + data
				+ "]";
	}
}

class Data {
	String id;
	String versionCode;

	String versionName;
	String type;
	String content;
	String createTime;
	String url;
	String md5;
	String fileName;
	String fileSize;
	String uploadId;
	String updateTime;
	String isDelete;

	@Override
	public String toString() {
		return "Data [id=" + id + ", versionCode=" + versionCode + ", versionName=" + versionName + ", type=" + type
				+ ", content=" + content + ", createTime=" + createTime + ", url=" + url + ", md5=" + md5
				+ ", fileName=" + fileName + ", fileSize=" + fileSize + ", uploadId=" + uploadId + ", updateTime="
				+ updateTime + ", isDelete=" + isDelete + "]";
	}
}