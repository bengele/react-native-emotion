//
//  EmotionModel.swift
//  asomeIOS
//
//  Created by 夏友彬 on 2020/3/25.
//  Copyright © 2020 夏友彬. All rights reserved.
//

import Foundation
import UIKit

class EmotionModel: NSObject {
    
    static let shared: EmotionModel = EmotionModel()
    
    var emotions :[EmotionNote]=[EmotionNote]()
    var emotionBundle :Bundle!
    
    override init() {
        let bundlePath = Bundle.init(for: EmotionComponent.classForCoder()).path(forResource: "emotions", ofType: "bundle")
        let plistPath = Bundle.init(for: EmotionComponent.classForCoder()).path(forResource: "emotions", ofType: "plist")
        emotionBundle = Bundle.init(path: bundlePath!)
        let array = NSArray(contentsOfFile: plistPath!) as! [[String : String]]
        for dict in array {
            emotions.append(EmotionNote(dict: dict,bundle: emotionBundle))
        }
    }
    
    //MARK: -获取所有表情
    func getAllEmotions() -> [EmotionNote] {
        return emotions;
    }
    
    //MARK:-获取表情数量
    func getEmotionsCount() -> Int {
        return emotions.count
    }
    
}

class EmotionNote: NSObject {
    var text :String?
    var imageName :String?
    
    var imagePath: String?
    
    override init() {
        super.init()
    }
    
    convenience init(dict:[String:String] ,bundle:Bundle){
        self.init()
//        setValuesForKeys(dict)
        text = dict["text"]
        imageName = dict["image"]
        
        imagePath = bundle.bundlePath + "/" + imageName! + ".png"
        NSLog("imagePath = %s", imagePath!)
    }
}

class EmotionComponent :NSObject {
    
    override init() {
        super.init()
    }
}
