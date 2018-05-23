
# react-native-power-manager

## Getting started

`$ npm install react-native-power-manager --save`

### Mostly automatic installation

`$ react-native link react-native-power-manager`

### Manual installation



#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNPowerManagerPackage;` to the imports at the top of the file
  - Add `new RNPowerManagerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-power-manager'
  	project(':react-native-power-manager').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-power-manager/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-power-manager')
  	```

## Usage
```javascript
import RNPowerManager from 'react-native-power-manager';

RNPowerManager.isHasProtectManager().then((deviceInfo)=>{
	if(deviceInfo){
		const { package, class } = deviceInfo;
		RNPowerManager.startIntent(package, class);
	}
});

RNPowerManager;
```
  