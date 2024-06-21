import { CssBaseline, ThemeProvider } from "@mui/material";
import { ColorModeContext, useMode } from "./theme";
import classNames from "classnames/bind";
import styles from "./index.css"; // Ensure the use of CSS modules
import Topbar from "~/scenes/global/Topbar/Topbar";
import { Route, BrowserRouter as Router, Routes } from "react-router-dom";
import { publicRoutes } from "./Routes";
import { Fragment } from "react";
import DefaultLayout from "./Layouts/DefaultLayout";

const cx = classNames.bind(styles);

function App() {
  const [theme, colorMode] = useMode();

  return (
    <ColorModeContext.Provider value={colorMode}>
      <ThemeProvider theme={theme}>
        <CssBaseline />
        <Router>
          <div className={cx("App")}>
            <Topbar />
            <main className={cx("content")}>
              <Routes>
                {publicRoutes.map((route, index) => {
                  let Layout = route.layout === undefined ? DefaultLayout : route.layout || Fragment;

                  const Page = route.component;
                  return (
                    <Route
                      key={index}
                      path={route.path}
                      element={
                        <Layout>
                          <Page />
                        </Layout>
                      }
                    />
                  );
                })}
              </Routes>
            </main>
          </div>
        </Router>
      </ThemeProvider>
    </ColorModeContext.Provider>
  );
}

export default App;
