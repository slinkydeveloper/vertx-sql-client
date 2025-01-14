package io.vertx.mysqlclient.tck;

import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.runner.RunWith;

@RunWith(VertxUnitRunner.class)
public class MySQLPreparedQueryPooledTest extends MySQLPreparedQueryTestBase {
  @Override
  protected void initConnector() {
    connector = ClientConfig.POOLED.connect(vertx, rule.options());
  }
}
