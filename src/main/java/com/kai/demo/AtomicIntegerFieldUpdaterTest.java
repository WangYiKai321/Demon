package com.kai.demo;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

import com.kai.concurrency.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: Kai Wang
 * @Date: 2020/08/20
 * @Description:
 */
@Slf4j
@ThreadSafe
public class AtomicIntegerFieldUpdaterTest {

    private static AtomicIntegerFieldUpdater<AtomicIntegerFieldUpdaterTest> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicIntegerFieldUpdaterTest.class,
                                                                                                                           "count");

    @Getter
    private volatile int count = 100;

    private static AtomicIntegerFieldUpdaterTest atomicIntegerFieldUpdaterTest = new AtomicIntegerFieldUpdaterTest();


    public static void main(String[] args) {
        if (updater.compareAndSet(atomicIntegerFieldUpdaterTest, 100, 120)) {
            log.info("update success 1,{}",atomicIntegerFieldUpdaterTest.getCount());
        }

        if (updater.compareAndSet(atomicIntegerFieldUpdaterTest, 100, 120)) {
            log.info("update success 2,{}",atomicIntegerFieldUpdaterTest.getCount());
        }else {
            log.info("update failed ,{}",atomicIntegerFieldUpdaterTest.getCount());
        }
    }
}
