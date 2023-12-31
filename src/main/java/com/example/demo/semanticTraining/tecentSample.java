//package com.example.demo.semanticTraining;
//import com.tencentcloudapi.common.Credential;
//import com.tencentcloudapi.common.profile.ClientProfile;
//import com.tencentcloudapi.common.profile.HttpProfile;
//import com.tencentcloudapi.common.exception.TencentCloudSDKException;
//import com.tencentcloudapi.nlp.v20190408.NlpClient;
//import com.tencentcloudapi.nlp.v20190408.models.*;
//public class tecentSample {
//    public static void main(String [] args) {
//        try{
//            // 实例化一个认证对象，入参需要传入腾讯云账户 SecretId 和 SecretKey，此处还需注意密钥对的保密
//            // 代码泄露可能会导致 SecretId 和 SecretKey 泄露，并威胁账号下所有资源的安全性。以下代码示例仅供参考，建议采用更安全的方式来使用密钥，请参见：https://cloud.tencent.com/document/product/1278/85305
//            // 密钥可前往官网控制台 https://console.cloud.tencent.com/cam/capi 进行获取
//            Credential cred = new Credential("AKIDsPuDKH1bzBAvTxGNK2VkkY8TZdV8WgdL", "WnrjPtBG8mDXdV9YidJm25uYx87ucCbq");
//            // 实例化一个http选项，可选的，没有特殊需求可以跳过
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("nlp.tencentcloudapi.com");
//            // 实例化一个client选项，可选的，没有特殊需求可以跳过
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//            // 实例化要请求产品的client对象,clientProfile是可选的
//            NlpClient client = new NlpClient(cred, "ap-guangzhou", clientProfile);
//            // 实例化一个请求对象,每个接口都会对应一个request对象
//            SentimentAnalysisRequest req = new SentimentAnalysisRequest();
//            req.setText("好地方 我喜欢");
//
//            // 返回的resp是一个SentimentAnalysisResponse的实例，与请求对象对应
//            SentimentAnalysisResponse resp = client.SentimentAnalysis(req);
//            // 输出json格式的字符串回包
//            System.out.println(SentimentAnalysisResponse.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            System.out.println(e.toString());
//        }
//    }
//}
