import { Box } from "@mui/material";
import Header from "~/components/Header";
import LineChart from "~/components/LineChart";

function LinePage() {

    return (
        <Box>
            <Header title='LINE CHART' subtitle='Create line chart'/>
            <Box sx={{width: '100%', height: '75vh'}}>
                <LineChart />
            </Box>
        </Box>
      );
      
}

export default LinePage;