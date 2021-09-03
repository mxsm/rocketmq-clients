// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

public interface QueryRouteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v1.QueryRouteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v1.Resource topic = 1;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>.apache.rocketmq.v1.Resource topic = 1;</code>
   * @return The topic.
   */
  apache.rocketmq.v1.Resource getTopic();
  /**
   * <code>.apache.rocketmq.v1.Resource topic = 1;</code>
   */
  apache.rocketmq.v1.ResourceOrBuilder getTopicOrBuilder();

  /**
   * <pre>
   * Service access point
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Endpoints endpoints = 2;</code>
   * @return Whether the endpoints field is set.
   */
  boolean hasEndpoints();
  /**
   * <pre>
   * Service access point
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Endpoints endpoints = 2;</code>
   * @return The endpoints.
   */
  apache.rocketmq.v1.Endpoints getEndpoints();
  /**
   * <pre>
   * Service access point
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Endpoints endpoints = 2;</code>
   */
  apache.rocketmq.v1.EndpointsOrBuilder getEndpointsOrBuilder();
}
