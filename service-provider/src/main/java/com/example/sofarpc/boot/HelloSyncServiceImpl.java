package com.example.sofarpc.boot;

/**
 * @author: QUAN
 * @date: Created in 2019/7/24 10:35
 * @description:
 * @modified By:
 */
public class HelloSyncServiceImpl implements HelloSyncService {
    @Override
    public String saySync(String string) {
        return string;
    }
}
