package com.entity.app.filter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/
 * @Version: 1.0
 * @Description: TODO()
 */
@ConfigurationProperties(
        prefix = "hzh.filters"
)
public class XssFilterConfig {
    private boolean enabled = true;
    private List<String> whiteList;

    public XssFilterConfig() {
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public List<String> getWhiteList() {
        return this.whiteList;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setWhiteList(List<String> whiteList) {
        this.whiteList = whiteList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof XssFilterConfig)) {
            return false;
        } else {
            XssFilterConfig other = (XssFilterConfig)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.isEnabled() != other.isEnabled()) {
                return false;
            } else {
                Object this$whiteList = this.getWhiteList();
                Object other$whiteList = other.getWhiteList();
                if (this$whiteList == null) {
                    if (other$whiteList != null) {
                        return false;
                    }
                } else if (!this$whiteList.equals(other$whiteList)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof XssFilterConfig;
    }

 /*   public int hashCode() {
        int PRIME = true;
        int result = 1;
        int result = result * 59 + (this.isEnabled() ? 79 : 97);
        Object $whiteList = this.getWhiteList();
        result = result * 59 + ($whiteList == null ? 43 : $whiteList.hashCode());
        return result;
    }*/

    public String toString() {
        return "XssFilterConfig(enabled=" + this.isEnabled() + ", whiteList=" + this.getWhiteList() + ")";
    }
}

