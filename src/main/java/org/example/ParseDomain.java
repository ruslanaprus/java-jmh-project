package org.example;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseDomain {
    private final String url;

    public ParseDomain(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    public String parseDomainOne() {
        int firstIndex = url.indexOf('/') + 2;
        int lastIndex = url.indexOf('/', firstIndex);

        if (lastIndex == -1) {
            return url.substring(firstIndex );
        }
        return url.substring(firstIndex, lastIndex);
    }

    public String parseDomainTwo() {
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex == -1) {
            return null; // Invalid URL
        }
        int domainStartIndex = protocolEndIndex + 3; // Skip past "://"
        int domainEndIndex = url.indexOf('/', domainStartIndex);
        if (domainEndIndex == -1) {
            domainEndIndex = url.length(); // If there's no trailing '/', the domain goes to the end of the string
        }
        return url.substring(domainStartIndex, domainEndIndex);
    }

    public String parseDomainThree() {
        URL newUrl = null;
        try {
            newUrl = new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        String domain = newUrl.getHost();
        return domain;
    }

    public String parseDomainFour(){
        String[] str1 = url.split("//");
        String[] str2 = str1[1].split("/");
        return String.valueOf(str2[0]);
    }
}
