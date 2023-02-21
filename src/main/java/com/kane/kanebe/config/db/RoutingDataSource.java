package com.kane.kanebe.config.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author kane
 * @apiNote @Transactional(readOnly = true) 인 경우 slave 사용 router
 * AWS Aurora mysql을 쓰면 Connection 1개로 따로 설정을 안해줘도 readonly 에 따라 분리해줌.
 * 또한, AWS Aurora mysql은 maria jdbc driver를 쓰는데 mysql driver를 쓰는 경우 failover 라던지,
 * auto scaling 같은 기능을 제대로 지원하지 못함. 따라서 maria driver 를 사용
 */
//public class RoutingDataSource extends AbstractRoutingDataSource {
//
//    @Override
//    protected Object determineCurrentLookupKey() {
//        return (TransactionSynchronizationManager.isCurrentTransactionReadOnly())
//                ? "SLAVE"
//                : "MASTER";
//    }
//}
