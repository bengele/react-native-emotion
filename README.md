
# react-native-emotion

## Getting started

`$ npm install react-native-emotion --save`

### Mostly automatic installation

`$ react-native link react-native-emotion`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-emotion` and add `RNEmotion.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNEmotion.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### pod
1. `pod 'react-native-emotion', :path => './node_modules/react-native-emotion' `
2. `pod install ` or `pod update --verbose --no-repo-update ` 


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.rn.emotion.RNEmotionPackage;` to the imports at the top of the file
  - Add `new RNEmotionPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-emotion'
  	project(':react-native-emotion').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-emotion/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-emotion')
  	```


## Usage
```javascript
import {EmotionView} from 'react-native-emotion';

<EmotionView
    style={{ width: 200, height: 100 }}
    text={"表情[微笑][撇嘴][色][发呆]"}
/>
```

###### TIP:Emojis may be involved in copyright infringement
  