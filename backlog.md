#一.服务宕机后
##1.本地调用应该有重试机制
##2.保证网络延迟幂等性的问题，防止重复提交
##3.做好服务降级，不能一直调用，返回友好的提示