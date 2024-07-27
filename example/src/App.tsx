import { StyleSheet, View, Button } from 'react-native';
import { requestReview } from 'react-native-request-review';

export default function App() {
  return (
    <View style={styles.container}>
      <Button onPress={requestReview} title="Request review" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
