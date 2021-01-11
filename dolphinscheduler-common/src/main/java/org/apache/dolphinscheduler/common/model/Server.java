/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.common.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * server
 */
public class Server {

    /**
     * processId
     */
    private int processId;

    /**
     * serverId
     */
    private int serverId;

    /**
     * host
     */
    private String host;

    /**
     * port
     */
    private int port;

    /**
     * master directory in zookeeper
     */
    private String zkDirectory;

    /**
     * resource info: CPU and memory
     */
    private String resInfo;

    /**
     * create time
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    /**
     * laster heart beat time
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastHeartbeatTime;

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getZkDirectory() {
        return zkDirectory;
    }

    public void setZkDirectory(String zkDirectory) {
        this.zkDirectory = zkDirectory;
    }

    public Date getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }

    public void setLastHeartbeatTime(Date lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
    }

    public String getResInfo() {
        return resInfo;
    }

    public void setResInfo(String resInfo) {
        this.resInfo = resInfo;
    }

    @Override
    public String toString() {
        return "MasterServer{" +
                "processId=" + processId +
                ", serverId=" + serverId +
                ", host='" + host + '\'' +
                ", port=" + port +
                ", zkDirectory='" + zkDirectory + '\'' +
                ", resInfo='" + resInfo + '\'' +
                ", createTime=" + createTime +
                ", lastHeartbeatTime=" + lastHeartbeatTime +
                '}';
    }
}
