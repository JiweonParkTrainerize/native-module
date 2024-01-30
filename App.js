import { StyleSheet, Text, View } from 'react-native';
import NewModuleButton from './NewModuleButton';
import MyView from './MyView';
import MYCustomImageView from './ImageView';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Open up App.js to start working on your app!</Text>
      <NewModuleButton />
      <MyView>
      <MYCustomImageView
          src={[
            {
              uri: 'https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png',
            },
          ]}
          borderRadius={10}
          resizeMode="cover"
          style={styles.imageView}
        />
      </MyView>
      {/* <ImageView /> */}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  imageView: {
    width: 300,  // Adjust the size as needed
    height: 300, // Adjust the size as needed
  },
});
