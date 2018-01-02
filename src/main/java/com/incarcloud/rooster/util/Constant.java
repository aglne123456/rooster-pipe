package com.incarcloud.rooster.util;

/**
 * 常量类
 *
 * @author Kong, Created on 2017/12/18.
 * @since 2.1.4-SNAPSHOT
 */
public interface Constant {

    Integer TIME_OUT = 30;

    /**
     * 心跳类型：1-登录, 2-登出, 3-心跳
     */
    interface HeartbeatType {

        /**
         * 1-登录
         */
        int LOGIN = 1;

        /**
         * 2-登出
         */
        int LOGOUT = 2;

        /**
         * 3-心跳
         */
        int NORMAL = 3;

    }

    /**
     * 数据包MAP键名
     */
    interface HeartbeatDataMapKey {
        /**
         * 类型
         */
        String TYPE = "type";
        
        /**
         * 时间
         */
        String TIME = "time";
    }

    /**
     * Redis命名空间
     */
    interface RedisNamespace {

        /**
         * 车辆VIN与设备号缓存NS
         */
        String REDIS_NS_VEHICLE_VIN = "com.incarcloud.rooster:vehicle-vin:";

        /**
         * 设备号与VIN缓存NS
         */
        String REDIS_NS_DEVICE_CODE = "com.incarcloud.rooster:device-code:";

        /**
         * 车辆VIN与心跳数据缓存NS
         */
        String REDIS_NS_DEVICE_HEARTBEAT = "com.incarcloud.rooster:device-heartbeat:";

        /**
         * 车辆VIN与在线时间NS
         */
        String REDIS_NS_DEVICE_ONLINE = "com.incarcloud.rooster:device-online:";

        /**
         * 车辆VIN与离线时间NS
         */
        String REDIS_NS_DEVICE_OFFLINE = "com.incarcloud.rooster:device-offline:";

    }
}
