package com.sparkle.auth.adapter;

import com.sparkle.auth.entity.OauthClientDetails;
import com.sparkle.auth.utils.CollectionUtil;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.*;

/**
 * ClassName : ClientDetailsAdapter<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/4/14
 */
public class ClientDetailsAdapter implements ClientDetails {

    private OauthClientDetails clientDetails;

    public ClientDetailsAdapter(OauthClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    @Override
    public String getClientId() {
        return clientDetails.getAppKey();
    }

    @Override
    public Set<String> getResourceIds() {
        return CollectionUtil.getSetBySplit(clientDetails.getResourceIds());
    }

    @Override
    public boolean isSecretRequired() {
        return true;
    }

    @Override
    public String getClientSecret() {
        return clientDetails.getAppSecret();
    }

    /**
     * 客户端是否为特定范围，如果该值返回false，则忽略身份认证的请求范围（scope的值）
     *
     * @return
     */
    @Override
    public boolean isScoped() {
        return true;
    }

    /**
     * 客户端拥有的授权范围
     *
     * @return
     */
    @Override
    public Set<String> getScope() {
        return CollectionUtil.getSetBySplit(clientDetails.getScope());
    }

    /**
     * 客户端拥有的授权方式
     *
     * @return
     */
    @Override
    public Set<String> getAuthorizedGrantTypes() {
        return CollectionUtil.getSetBySplit(clientDetails.getAuthorizedGrantTypes());
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        return CollectionUtil.getSetBySplit(clientDetails.getRedirectUri());
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> list = new ArrayList<>();
        for (String item : CollectionUtil.getSetBySplit(clientDetails.getAuthorities())) {
            GrantedAuthority authority = new SimpleGrantedAuthority(item);
            list.add(authority);
        }
        return list;
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return clientDetails.getAccessTokenValidity();
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return clientDetails.getRefreshTokenValidity();
    }

    @Override
    public boolean isAutoApprove(String scope) {
        return false;
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        return null;
    }

    /**
     * 第三应用是否可信任
     *
     * @return
     */
    public boolean isTrusted() {
        return clientDetails.getTrusted().intValue() == 1;
    }

    public OauthClientDetails getClientDetails() {
        return clientDetails;
    }

}
