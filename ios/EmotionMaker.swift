//
//  EmotionMaker.swift
//  asomeIOS
//
//  Created by 夏友彬 on 2020/3/25.
//  Copyright © 2020 夏友彬. All rights reserved.
//

import Foundation
import UIKit

@objc(EmotionMaker)
public class EmotionMaker: NSObject {
    @objc
    public static let shared: EmotionMaker = EmotionMaker()
    
    //MARK: -查找字符串
    @objc
    public func findEmotionAttrString(text: String?,size: Int) -> NSMutableAttributedString? {
        guard let text = text else {
            return nil
        }
        let pattern = "\\[.*?\\]"
        
        guard let regex = try? NSRegularExpression(pattern: pattern, options: []) else {
            return nil
        }
        
        let resutlts = regex.matches(in: text, options: [], range: NSMakeRange(0, text.count))
        
        let attrMStr = NSMutableAttributedString(string: text)
        
        for (_, result) in resutlts.enumerated().reversed() {
            let emoStr = (text as NSString).substring(with: result.range)
            guard let imgPath = findImagePath(text: emoStr) else {
                return nil
            }
            let attachment = NSTextAttachment()
            attachment.image = UIImage(contentsOfFile: imgPath)
            attachment.bounds = CGRect(x: 0, y: -4, width: size, height: size)
            let attrImageStr = NSAttributedString(attachment: attachment)
            attrMStr.replaceCharacters(in: result.range, with: attrImageStr)
        }
        return attrMStr
    }
    
    func findImagePath(text:String) -> String? {
        for emotion in EmotionModel.shared.getAllEmotions() {
            if emotion.text == text{
                return emotion.imagePath
            }
        }
        return nil
    }
}
