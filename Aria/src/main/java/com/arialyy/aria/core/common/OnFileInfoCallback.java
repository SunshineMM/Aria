package com.arialyy.aria.core.common;

public interface OnFileInfoCallback {
  /**
   * 处理完成
   *
   * @param code 状态码
   */
  void onComplete(String url, int code);

  /**
   * 请求失败
   *
   * @param errorMsg 错误信息
   */
  void onFail(String url, String errorMsg, boolean needRetry);
}