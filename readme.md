# 系统设计

## User模块（数据库）
1. 用户登录  
2. 用户注册
3. 忘记密码
4. 邮箱验证

## GANASD app
登录注册
app名称
样本数据发送
状态接收
老化告警

## 边缘模块（数据库）
模型判别
状态回传
样本转发

## Core模块（数据库 + 缓存）
1. 数据生成
2. 聚类训练
3. 发送聚类模型
4. 压力测试
5. Context接收

## 管理模块
边缘设备管理
用户管理
微服务注册管理
全网拓扑管理

# 数据库设计

## User
1. userId
2. email
3. username
4. password
5. phoneId

## Phone
1. phoneId
2. userId
3. phoneName
4. phoneInfo
5. AppList

## Log
1. phoneId
2. date
3. userId
4. dataList
5. statusList