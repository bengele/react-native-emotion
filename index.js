"use strict";
import { Component } from "react";
import PropTypes from "prop-types";
import { View, requireNativeComponent } from "react-native";

const DEmotionView = requireNativeComponent("EmotionView", {
  propTypes: {
    text: PropTypes.string,
    // ...View.propTypes // 包含默认的View的属性
  }
});

export class EmotionView extends Component {
  constructor() {
    this.state = {
      emotionText: this.props.text || ""
    };
  }

  render() {
    const { text, ...restProps } = this.props;
    const { emotionText } = this.state;
    return <DEmotionView text={emotionText} {...restProps} />;
  }
}
