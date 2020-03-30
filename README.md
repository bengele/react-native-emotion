
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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNEmotion.sln` in `node_modules/react-native-emotion/windows/RNEmotion.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Emotion.RNEmotion;` to the usings at the top of the file
  - Add `new RNEmotionPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNEmotion from 'react-native-emotion';

// TODO: What to do with the module?
RNEmotion;
```
  