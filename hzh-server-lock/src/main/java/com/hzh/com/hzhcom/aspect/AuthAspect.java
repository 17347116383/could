package com.hzh.com.hzhcom.aspect;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description:
 * @Date: 2020/9/5
 * @Version: 1.0
 * @Description: TODO()
 */
@Aspect
@Component
@Slf4j
@Order(0)
public class AuthAspect {



   /* @Pointcut("execution(public * cn.com.jxlife.mss.*.web.application.*.*(..))"
            + "&& !execution(* cn.com.jxlife.mss.*.web.application.WarningCallBackController.*(..))")
    public void verify() {
    }*/



  //  @Before("verify()")
    public void doBefore(JoinPoint joinPoint) throws Exception {
       /* log.info("微信授权码效验");
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();
        Method realMethod = joinPoint.getTarget().getClass()
                .getDeclaredMethod(signature.getName(), targetMethod.getParameterTypes());
        MssAnnotation msschoice = realMethod
                .getAnnotation(MssAnnotation.class);
        BaseRequest baseRequest = null;
        Object[] args = joinPoint.getArgs();

        for (Object obj : args) {
            if (obj instanceof BaseRequest) {
                baseRequest = (BaseRequest) obj;
                break;
            }

        }
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();
        //boolean isfileupload = ServletFileUpload.isMultipartContent(request);
        String authCode = request.getParameter(PubConstant.URL_HASH_PARAM_NAME);
        String requestId = request.getHeader(MssHttpHeaderEnum.REQUEST_ID.getCode());
        //微信分享授权码不为空
        if (StringUtils.isNotBlank(authCode)) {
            Headers headers = null;
            String transId = "";
            String openId = "";
            if (baseRequest != null) {
                headers = baseRequest.getHeaders();
            } else {
                //构造header
                headers = createHeaders(request);
            }
            transId = headers.getTransId();
            openId = headers.getOpenid();
            String bizId = BizUtils.getBizId(joinPoint, msschoice);
            if (StringUtils.isNotBlank(bizId)) {
                requestId = bizId;
            }
            if (headers == null) {
                log.error(ResponseCodeEnum.BASEREQUEST_HEAD_NULL.getMessage());
                throw ExceptionUtils
                        .systemException(redisCacheUtils, ResponseCodeEnum.BASEREQUEST_HEAD_NULL.getCode(),
                                requestId);

            }

            if (StringUtils.isBlank(openId)) {
                log.error(ResponseCodeEnum.BASEREQUEST_HEAD_NULL.getMessage());
                throw ExceptionUtils
                        .systemException(redisCacheUtils, ResponseCodeEnum.PARAM_NULL.getCode(),
                                requestId, transId, new String[]{"openid"});
            }
            WechatShareRequestType requestType = new WechatShareRequestType();
            String url = request.getRequestURI();
            requestType.setUrl(url);
            requestType.setAuthCode(authCode);
            requestType.setManualHeaders(headers);
            WechatShareResponseType responseType = wechatShareService.checkShareUrl(requestType);

            //授权码与请求的URL是否匹配
            boolean isWechatShare = responseType.isWechatShare();
            if (isWechatShare) {
                //授权码是否有效
                boolean valid = responseType.isValid();
                if (valid) {
                    //授权码访问用户数量是否超过最大数
                    boolean overUsers = responseType.isOverUsers();
                    if (!overUsers) {
                        // TOKEN
                        String token = createToken(responseType.getWechatShareVo().getShareUserId(),
                                headers, authCode);
                        if (StringUtils.isBlank(token)) {
                            throw ExceptionUtils.systemException(redisCacheUtils,
                                    ResponseCodeEnum.AUTH_CODE_LOGIN_FAIL.getCode(), requestId, transId);
                        }
                        headers.setToken(token);

                        String redisKey = RedisKeyUtils.assembleWechatShareTokenUserKey(token);
                        //放到redis缓存，设置过期时间为5分钟
                        redisCacheUtils.set(redisKey, token);
                        redisCacheUtils.expire(redisKey, FIVE_MIN);
                        THREAD_LOCAL.set(token);
                        THREAD_LOGIN_TYPE_LOCAL.set(AUTH_TYPE);
                        //
                        UserThreadLocal.AUTH_CODE_BIZ_ID.set(responseType.getWechatShareVo().getBizId());
                        UserThreadLocal.AUTH_CODE_BIZ_TYPE.set(responseType.getWechatShareVo().getBizType());
                        UserThreadLocal.AUTH_CODE.set(authCode);
                        //设置微信分享授权码
                        headers.setAuthCode(authCode);
                    } else {
                        throw ExceptionUtils.systemException(redisCacheUtils,
                                ResponseCodeEnum.WECHAT_SHARE_OVER_USERS.getCode(), requestId, transId);
                    }
                } else {
                    throw ExceptionUtils
                            .systemException(redisCacheUtils, ResponseCodeEnum.WECHAT_SHARE_INVALID.getCode(),
                                    requestId, transId);

                }
            } else {
                throw ExceptionUtils
                        .systemException(redisCacheUtils, ResponseCodeEnum.WECHAT_NOT_SHARE.getCode(),
                                requestId, transId);
            }
        } else {
            String authUser = request.getHeader(MssHttpHeaderEnum.AUTH_USER.getCode());
            //内部服务调用，先调用统一身份认证登录接口
            if (StringUtils.isNotBlank(authUser)) {
                Headers headers = null;
                if (baseRequest == null) {
                    headers = createHeaders(request);
                }else{
                    headers = baseRequest.getHeaders();
                }

                if (headers == null) {
                    log.error(ResponseCodeEnum.BASEREQUEST_HEAD_NULL.getMessage());
                    throw ExceptionUtils
                            .systemException(redisCacheUtils, ResponseCodeEnum.BASEREQUEST_HEAD_NULL.getCode(),
                                    requestId);
                }
                String transId = headers.getTransId();
                String bizId = BizUtils.getBizId(joinPoint, msschoice);
                if (StringUtils.isNotBlank(bizId)) {
                    requestId = bizId;
                }
                //登录
                userLogin(authUser, requestId, transId, headers);
            }
        }
*/
    }
}
