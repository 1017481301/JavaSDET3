package test_app.wework.page;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 报告PageTest {

    private static Wework wework;

    @BeforeAll
    static void beforeAll(){
        wework = new Wework();
    }
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void 添加日报() {
        报告详情Page work = wework.to工作台().to汇报().to报告("日报")
                .add("添加今日工作内容", "添加明日计划", "添加日报其他").to报告详情Page();
    }

    @Test
    void 添加周报() {
        报告详情Page work = wework.to工作台().to汇报().to报告("周报")
                .add("添加本周工作内容", "添加下周计划", "添加周报其他").to报告详情Page();
    }
}