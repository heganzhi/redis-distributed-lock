package com.snowalker.lock.redisson.config.strategy;

import org.redisson.config.Config;

/**
 * @author snowalker
 * @date 2018/7/12
 * @desc Redisson配置上下文，产出真正的Redisson的Config
 */
public class RedissonConfigContext {

    private RedissonConfigStrategy redissonConfigStrategy = null;

    public RedissonConfigContext(RedissonConfigStrategy _redissonConfigStrategy) {
        this.redissonConfigStrategy = _redissonConfigStrategy;
    }

    /**
     * 上下文根据构造中传入的具体策略产出真实的Redisson的Config
     * @param address
     * @return
     */
    public Config createRedissonConfig(String address) {
        return this.redissonConfigStrategy.createRedissonConfig(address);
    }
}
