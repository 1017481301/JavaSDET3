package test_app.wework.page;

import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 待办PageTest {
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
    void 添加待办(){
        assertTrue(wework.to待办()
                .添加("2020-06-08待办", "", "2020-6-8")
                .获取待办().contains("2020-06-08待办"));
    }

}