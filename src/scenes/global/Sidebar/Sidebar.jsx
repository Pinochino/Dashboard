import classNames from "classnames/bind";
import styles from './Sidebar.module.scss';
import { useState } from "react";
import { Menu, MenuItem, ProSidebar} from 'react-pro-sidebar';
import 'react-pro-sidebar/dist/styles';
import { Box, IconButton, Typography, useTheme } from "@mui/material";
import { Link } from "react-router-dom";
import { tokens } from "~/theme";


import HomeOutlinedIcon from "@mui/icons-material/HomeOutlined";
import PeopleOutlineIcon from "@mui/icons-material/PeopleOutline";
import ContactsOutlinedIcon from "@mui/icons-material/ContactsOutlined";
import ReceiptOutlinedIcon from "@mui/icons-material/ReceiptOutlined";
import PersonOutlinedIcon from "@mui/icons-material/PersonOutlined";
import CalendarTodayOutlinedIcon from "@mui/icons-material/CalendarTodayOutlined";
import BarChartOutlinedIcon from "@mui/icons-material/BarChartOutlined";
import PieChartOutlineIcon from "@mui/icons-material/PieChartOutline";
import TimelineOutlinedIcon from "@mui/icons-material/TimelineOutlined";
import MenuOutlinedIcon from "@mui/icons-material/MenuOutlined";
import MapOutlinedIcon from "@mui/icons-material/MapOutlined";
import { type } from "@testing-library/user-event/dist/type";


const cx = classNames.bind(styles);

const BREAK_POINTS = {
  xs: '480px',
  sm: '576px',
  md: '768px',
  lg: '992px',
  xl: '1200px',
  xxl: '1600px',
  always: 'always',
  all: 'all',
};

function Sidebar() {
    const theme = useTheme();
    const colors = tokens(theme.palette.mode);
    const [isCollapsed, setCollapsed] = useState(false);
    const [selected, setSelected] = useState("Dashboard");


    return (
      <Box
        className={cx("wrapper")}
        sx={{
          "& .pro-sidebar-inner": {
            background: `${colors.primary[400]} !important`,
          },
          "& .pro-sidebar-wrapper": {
            backgroundColor: "transparent !important",
          },
          "& .pro-inner-item": {
            padding: "5px 35px 5px 30px !important",
          },

          "& .pro-menu-item:hover": {
            color: "#868dfb !important",
          },

          "& .pro-menu-item.active": {
            color: "#6870fa !important",
          },
        }}
      >
        <ProSidebar></ProSidebar>
      </Box>
    );
}

export default Sidebar;