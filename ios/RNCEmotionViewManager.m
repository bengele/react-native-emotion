
#import "RNCEmotionViewManager.h"
#import <react_native_emotion/react_native_emotion-Swift.h>




@interface RNCEmotionViewManager ()

@end

@implementation RNCEmotionViewManager{
    
}





RCT_EXPORT_MODULE()

- (EmotionView*)view{
    EmotionView* emotionView = [EmotionView new];
    return emotionView;
}


RCT_CUSTOM_VIEW_PROPERTY(text, NSString, EmotionView){
    [view setEmotionTextWithText:(NSString*)json];
}

@end
