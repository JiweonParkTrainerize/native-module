import React from 'react';
import { NativeModules, Button } from 'react-native';
import CalendarModule from './CalendarModule';
// const { CalendarModule } = NativeModules;

const NewModuleButton = () => {
  const onPress = () => {
    console.log('We will invoke the native module here!');
    // CalendarModule.createCalendarEvent('testName', 'testLocation');
    CalendarModule.createCalendarEvent('foo', 'bar');
  };

  return (
    <Button
      title="Click to invoke your native module!"
      color="#841584"
      onPress={onPress}
    />
  );
};

export default NewModuleButton;