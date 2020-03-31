//
//  EmotionView.swift
//  asomeIOS
//
//  表情视图
//
//  Created by 夏友彬 on 2020/3/24.
//  Copyright © 2020 夏友彬. All rights reserved.
//

import Foundation
import UIKit

@objc(EmotionView)
public class EmotionView: UILabel {
    
    override init(frame: CGRect) {
        super.init(frame: frame)
    }
    
    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    //MARK: -设置表情文字
    @objc
    public func setEmotionText(text:String) {
        setEmotionText(text: text, size: Int(self.font!.lineHeight))
    }

    //MARK: -设置表情文字，参数带表情size
    @objc
    public func setEmotionText(text:String,size:Int) {
        let emotionText = EmotionMaker.shared.findEmotionAttrString(text: text,size:size)
        self.attributedText = emotionText;
    }
}
