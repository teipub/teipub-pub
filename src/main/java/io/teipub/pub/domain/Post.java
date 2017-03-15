package io.teipub.pub.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by tei on 17. 3. 15.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@Entity
public class Post {


    @Id
    @GeneratedValue
    private Integer id;
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
