# Fact app
This app shows a fact via [fact free api](https://catfact.ninja/fact).

![Screenshot](./fact_app.png)

## Issues
It works but does not satisfy the requirements below.

### Must
We need to
- Show the `length` from the api response
- Access data via `Data layer`
- Add local data source (`DataStore`)
  - To show the previous fact for the next visit
- Add dependency injection by `Hilt`
- Add proper testing after introducing `Data layer` and `Hilt`
- Make the UI state immutable as much as possible

### Optional
If we have time, we want to
- (Design) Add the `Top app bar` and update the design 🏰
- (Testing) Add [JUnit5](https://github.com/mannodermaus/android-junit5) and `mockk`
- (Gradle) Add a `version catalog` 📗
- (Future growth) `Modularize` the app ✌🏻
- (Future growth) Add `Domain layer` 🚴‍️

## Time
We expect you to spend
- 1 hour on `Must`
- Another 1~2 hours on `Optional`

Optional requirements are optional, literally.  Please do them only if you can spend your valuable time on this.

## To submit your solution
Please
- Fork this repo ⑂
- Create a PR in your own repo 📝
  - ❌ Please do not create a PR in this repo
- Send your PR link to us 🙏
