package io.teipub.pub.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by tei on 17. 3. 15.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@Data
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
}
