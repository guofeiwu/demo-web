package com.example.web.service;

/**
 * @Author guofei_wu
 * @Date 2017/9/14 10:54
 */
public interface MailService {
    void sendSimpleMail(String to, String subject, String content);
    void sendHtmlMail(String to, String subject, String content);
    void sendAttachmentsMail(String to, String subject, String content, String filePath);
    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
