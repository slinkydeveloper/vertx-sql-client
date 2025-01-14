package io.vertx.mysqlclient;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.ClientOptionsBase;
import io.vertx.core.net.JdkSSLEngineOptions;
import io.vertx.core.net.JksOptions;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.OpenSSLEngineOptions;
import io.vertx.core.net.PemKeyCertOptions;
import io.vertx.core.net.PemTrustOptions;
import io.vertx.core.net.PfxOptions;
import io.vertx.core.net.ProxyOptions;
import io.vertx.core.net.SSLEngineOptions;
import io.vertx.core.net.TrustOptions;
import io.vertx.sqlclient.SqlConnectOptions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Connect options for configuring {@link MySQLConnection} or {@link MySQLPool}.
 */
@DataObject(generateConverter = true)
public class MySQLConnectOptions extends SqlConnectOptions {

  public static final String DEFAULT_HOST = "localhost";
  public static final int DEFAULT_PORT = 3306;
  public static final String DEFAULT_USER = "root";
  public static final String DEFAULT_PASSWORD = "";
  public static final String DEFAULT_SCHEMA = "";

  public MySQLConnectOptions() {
    super();
  }

  public MySQLConnectOptions(JsonObject json) {
    super(json);
    MySQLConnectOptionsConverter.fromJson(json, this);
  }

  public MySQLConnectOptions(MySQLConnectOptions other) {
    super(other);
  }

  @Override
  public MySQLConnectOptions setHost(String host) {
    return (MySQLConnectOptions) super.setHost(host);
  }

  @Override
  public MySQLConnectOptions setPort(int port) {
    return (MySQLConnectOptions) super.setPort(port);
  }

  @Override
  public MySQLConnectOptions setUser(String user) {
    return (MySQLConnectOptions) super.setUser(user);
  }

  @Override
  public MySQLConnectOptions setPassword(String password) {
    return (MySQLConnectOptions) super.setPassword(password);
  }

  @Override
  public MySQLConnectOptions setDatabase(String database) {
    return (MySQLConnectOptions) super.setDatabase(database);
  }

  @Override
  public MySQLConnectOptions setSendBufferSize(int sendBufferSize) {
    return (MySQLConnectOptions) super.setSendBufferSize(sendBufferSize);
  }

  @Override
  public MySQLConnectOptions setReceiveBufferSize(int receiveBufferSize) {
    return (MySQLConnectOptions) super.setReceiveBufferSize(receiveBufferSize);
  }

  @Override
  public MySQLConnectOptions setReuseAddress(boolean reuseAddress) {
    return (MySQLConnectOptions) super.setReuseAddress(reuseAddress);
  }

  @Override
  public MySQLConnectOptions setReusePort(boolean reusePort) {
    return (MySQLConnectOptions) super.setReusePort(reusePort);
  }

  @Override
  public MySQLConnectOptions setTrafficClass(int trafficClass) {
    return (MySQLConnectOptions) super.setTrafficClass(trafficClass);
  }

  @Override
  public MySQLConnectOptions setTcpNoDelay(boolean tcpNoDelay) {
    return (MySQLConnectOptions) super.setTcpNoDelay(tcpNoDelay);
  }

  @Override
  public MySQLConnectOptions setTcpKeepAlive(boolean tcpKeepAlive) {
    return (MySQLConnectOptions) super.setTcpKeepAlive(tcpKeepAlive);
  }

  @Override
  public MySQLConnectOptions setSoLinger(int soLinger) {
    return (MySQLConnectOptions) super.setSoLinger(soLinger);
  }

  @Override
  public MySQLConnectOptions setUsePooledBuffers(boolean usePooledBuffers) {
    return (MySQLConnectOptions) super.setUsePooledBuffers(usePooledBuffers);
  }

  @Override
  public MySQLConnectOptions setIdleTimeout(int idleTimeout) {
    return (MySQLConnectOptions) super.setIdleTimeout(idleTimeout);
  }

  @Override
  public MySQLConnectOptions setIdleTimeoutUnit(TimeUnit idleTimeoutUnit) {
    return (MySQLConnectOptions) super.setIdleTimeoutUnit(idleTimeoutUnit);
  }

  @Override
  public MySQLConnectOptions setKeyCertOptions(KeyCertOptions options) {
    return (MySQLConnectOptions) super.setKeyCertOptions(options);
  }

  @Override
  public MySQLConnectOptions setKeyStoreOptions(JksOptions options) {
    return (MySQLConnectOptions) super.setKeyStoreOptions(options);
  }

  @Override
  public MySQLConnectOptions setPfxKeyCertOptions(PfxOptions options) {
    return (MySQLConnectOptions) super.setPfxKeyCertOptions(options);
  }

  @Override
  public MySQLConnectOptions setPemKeyCertOptions(PemKeyCertOptions options) {
    return (MySQLConnectOptions) super.setPemKeyCertOptions(options);
  }

  @Override
  public MySQLConnectOptions setTrustOptions(TrustOptions options) {
    return (MySQLConnectOptions) super.setTrustOptions(options);
  }

  @Override
  public MySQLConnectOptions setTrustStoreOptions(JksOptions options) {
    return (MySQLConnectOptions) super.setTrustStoreOptions(options);
  }

  @Override
  public MySQLConnectOptions setPemTrustOptions(PemTrustOptions options) {
    return (MySQLConnectOptions) super.setPemTrustOptions(options);
  }

  @Override
  public MySQLConnectOptions setPfxTrustOptions(PfxOptions options) {
    return (MySQLConnectOptions) super.setPfxTrustOptions(options);
  }

  @Override
  public MySQLConnectOptions addEnabledCipherSuite(String suite) {
    return (MySQLConnectOptions) super.addEnabledCipherSuite(suite);
  }

  @Override
  public MySQLConnectOptions addEnabledSecureTransportProtocol(String protocol) {
    return (MySQLConnectOptions) super.addEnabledSecureTransportProtocol(protocol);
  }

  @Override
  public MySQLConnectOptions removeEnabledSecureTransportProtocol(String protocol) {
    return (MySQLConnectOptions) super.removeEnabledSecureTransportProtocol(protocol);
  }

  @Override
  public MySQLConnectOptions setUseAlpn(boolean useAlpn) {
    return (MySQLConnectOptions) super.setUseAlpn(useAlpn);
  }

  @Override
  public MySQLConnectOptions setSslEngineOptions(SSLEngineOptions sslEngineOptions) {
    return (MySQLConnectOptions) super.setSslEngineOptions(sslEngineOptions);
  }

  @Override
  public MySQLConnectOptions setJdkSslEngineOptions(JdkSSLEngineOptions sslEngineOptions) {
    return (MySQLConnectOptions) super.setJdkSslEngineOptions(sslEngineOptions);
  }

  @Override
  public MySQLConnectOptions setTcpFastOpen(boolean tcpFastOpen) {
    return (MySQLConnectOptions) super.setTcpFastOpen(tcpFastOpen);
  }

  @Override
  public MySQLConnectOptions setTcpCork(boolean tcpCork) {
    return (MySQLConnectOptions) super.setTcpCork(tcpCork);
  }

  @Override
  public MySQLConnectOptions setTcpQuickAck(boolean tcpQuickAck) {
    return (MySQLConnectOptions) super.setTcpQuickAck(tcpQuickAck);
  }

  @Override
  public ClientOptionsBase setOpenSslEngineOptions(OpenSSLEngineOptions sslEngineOptions) {
    return super.setOpenSslEngineOptions(sslEngineOptions);
  }

  @Override
  public MySQLConnectOptions addCrlPath(String crlPath) throws NullPointerException {
    return (MySQLConnectOptions) super.addCrlPath(crlPath);
  }

  @Override
  public MySQLConnectOptions addCrlValue(Buffer crlValue) throws NullPointerException {
    return (MySQLConnectOptions) super.addCrlValue(crlValue);
  }

  @Override
  public MySQLConnectOptions setTrustAll(boolean trustAll) {
    return (MySQLConnectOptions) super.setTrustAll(trustAll);
  }

  @Override
  public MySQLConnectOptions setConnectTimeout(int connectTimeout) {
    return (MySQLConnectOptions) super.setConnectTimeout(connectTimeout);
  }

  @Override
  public MySQLConnectOptions setMetricsName(String metricsName) {
    return (MySQLConnectOptions) super.setMetricsName(metricsName);
  }

  @Override
  public MySQLConnectOptions setReconnectAttempts(int attempts) {
    return (MySQLConnectOptions) super.setReconnectAttempts(attempts);
  }

  @Override
  public MySQLConnectOptions setReconnectInterval(long interval) {
    return (MySQLConnectOptions) super.setReconnectInterval(interval);
  }

  @Override
  public MySQLConnectOptions setHostnameVerificationAlgorithm(String hostnameVerificationAlgorithm) {
    return (MySQLConnectOptions) super.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm);
  }

  @Override
  public MySQLConnectOptions setLogActivity(boolean logEnabled) {
    return (MySQLConnectOptions) super.setLogActivity(logEnabled);
  }

  @Override
  public MySQLConnectOptions setProxyOptions(ProxyOptions proxyOptions) {
    return (MySQLConnectOptions) super.setProxyOptions(proxyOptions);
  }

  @Override
  public MySQLConnectOptions setLocalAddress(String localAddress) {
    return (MySQLConnectOptions) super.setLocalAddress(localAddress);
  }

  @Override
  public MySQLConnectOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols) {
    return (MySQLConnectOptions) super.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
  }

  @Override
  public MySQLConnectOptions setSslHandshakeTimeout(long sslHandshakeTimeout) {
    return (MySQLConnectOptions) super.setSslHandshakeTimeout(sslHandshakeTimeout);
  }

  @Override
  public MySQLConnectOptions setSslHandshakeTimeoutUnit(TimeUnit sslHandshakeTimeoutUnit) {
    return (MySQLConnectOptions) super.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit);
  }

  /**
   * Initialize with the default options.
   */
  protected void init() {
    this.setHost(DEFAULT_HOST);
    this.setPort(DEFAULT_PORT);
    this.setUser(DEFAULT_USER);
    this.setPassword(DEFAULT_PASSWORD);
    this.setDatabase(DEFAULT_SCHEMA);
  }

  @Override
  public JsonObject toJson() {
    JsonObject json = super.toJson();
    MySQLConnectOptionsConverter.toJson(this, json);
    return json;
  }
}
