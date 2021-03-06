package io.syndesis.connector.twitter.springboot;

import javax.annotation.Generated;
import io.syndesis.connector.twitter.TwitterMentionComponent;
import org.apache.camel.component.twitter.data.TimelineType;

/**
 * Send a notification when a name you specify is mentioned on Twitter.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.connector.SpringBootAutoConfigurationMojo")
public class TwitterMentionConnectorConfigurationCommon {

    /**
     * The access token
     */
    private String accessToken;
    /**
     * The access token secret
     */
    private String accessTokenSecret;
    /**
     * The consumer key
     */
    private String consumerKey;
    /**
     * The consumer secret
     */
    private String consumerSecret;
    /**
     * The timeline type to produce/consume.
     */
    private TimelineType timelineType = TimelineType.MENTIONS;
    /**
     * The last tweet id which will be used for pulling the tweets. It is useful
     * when the camel route is restarted after a long running.
     */
    private long sinceId = 1L;
    /**
     * Milliseconds before the next poll.
     */
    private long delay = 30000L;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessTokenSecret() {
        return accessTokenSecret;
    }

    public void setAccessTokenSecret(String accessTokenSecret) {
        this.accessTokenSecret = accessTokenSecret;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public TimelineType getTimelineType() {
        return timelineType;
    }

    public void setTimelineType(TimelineType timelineType) {
        this.timelineType = timelineType;
    }

    public long getSinceId() {
        return sinceId;
    }

    public void setSinceId(long sinceId) {
        this.sinceId = sinceId;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }
}