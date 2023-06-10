package com.works.service;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MozartService {

    public void result(){
        try {
            String url = "http://yiboyoung.com/music/mozart/mozart_complete/1EARLIERSYMPHONIES/EARLYSYMPHONIES.htm";
            Document doc = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get();
            Elements fonts = doc.getElementsByTag("font");
            for (Element item:fonts) {
                Elements elements = item.getElementsByAttributeValue("size","+2");
                for (Element itm : elements){
                    System.err.println(itm);
                }
            }
        }catch (Exception exception){
            System.err.println("mozart err: "+ exception);
        }
    }
}
