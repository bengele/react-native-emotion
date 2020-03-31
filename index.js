"use strict";
import React,{ Component } from "react";
import PropTypes from "prop-types";
import {View, requireNativeComponent ,NativeModules} from "react-native";

const RNEmotion = NativeModules.RNEmotion || {};

const RNCEmotionView = requireNativeComponent("RNCEmotionView", {
  propTypes: {
    text: PropTypes.string,
    ...View.propTypes // 包含默认的View的属性
  }
});

export class EmotionView extends Component {
  constructor(props) {
    super(props)
    this.state = {
      emotionText: props.text || ""
    };
  }

  setEmotionText(text){
    this.setState({emotionText:text})
  }

  render() {
    const { text, ...restProps } = this.props;
    const { emotionText } = this.state;
    
    return <RNCEmotionView  text={emotionText} {...restProps} />;
  }
}

