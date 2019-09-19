package com.chang;

import com.chang.Cal;
import org.springframework.stereotype.Component;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-19 16:15
 * @Copyright 北京木联能软件股份有限公司
 */
@Component
public class CalImpl implements Cal {
    public int add(int num1, int num2) {
        int result = num1+num2;
        return result;
    }

    public int sub(int num1, int num2) {
        int result = num1-num2;
        return result;
    }
}
