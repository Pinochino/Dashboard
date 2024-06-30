import { useTheme } from "@emotion/react";
import { Box, Button, colors } from "@mui/material";
import Header from "~/components/Header";
import { tokens } from "~/theme";

// ICONs
import DownloadOutlinedIcon from '@mui/icons-material/DownloadOutlined';


function Dashboard() {
  const theme = useTheme();
  const colors = tokens(theme.palette.mode);

  return (
    <Box display="flex" justifyContent="space-between" alignItems="center">
      <Box>
        <Header title="DASHBOARD" subtitle="Welcome to your dashboard" />
      </Box>
      <Box>
        <Button
        sx={{backgroundColor: colors.blueAccent[700],
          color: colors.grey[100],
          fontSize: '14px',
          fontWeight: 'bold',
          padding: '10px 20px',
        }}>
          <DownloadOutlinedIcon sx={{mr: '10px'}}>
            Download Report
          </DownloadOutlinedIcon>
        </Button>
      </Box>

      {/* GRID & CHARTs */}
        <Box
        display='grid'
        gridTemplateColumns='repeat(12, 1fr)'
        gridAutoRows='14rem'
        gap='2rem'
        >
          
          {/* ROW */}
          <Box

          >

          </Box>
        </Box>
    </Box>
  );
}

export default Dashboard;
